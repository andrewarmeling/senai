package estoque;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GerenciarEstoque {

	public void listarEstoque() {
		String saida = "Listagem de Estoque \n\n";

		for (Produto produto : Estoque.estoque) {
			saida += "Código: " + produto.getCodigo() + "\n";
			saida += "Nome: " + produto.getNome() + "\n";
			saida += "Preço: " + produto.getPreco() + "\n";
			saida += "Quantidade: " + produto.getQuantidade() + "\n\n";
		}

		JOptionPane.showMessageDialog(null, saida);
	}

	public void adicionarProduto() {
		int codigo = 0;
		boolean existe = false;
		do {
			existe = false;
			codigo = Integer.parseInt(JOptionPane.showInputDialog("Insira o código para o produto a ser adicionado: "));
			for (Produto produto : Estoque.estoque) {
				if (produto.getCodigo() == codigo) {
					existe = true;
					JOptionPane.showMessageDialog(null, "Código já existente! Insira outro código!", "Erro!",
							JOptionPane.OK_OPTION);
					break;
				}
			}
		} while (existe == true || codigo == 0);

		String textoNome = "Nome: ";
		JTextField campoNome = new JTextField();
		String textoPreco = "Preço: ";
		JTextField campoPreco = new JTextField();
		String textoQuantidade = "Quantidade: ";
		JTextField campoQuantidade = new JTextField();

		Object[] saida = { textoNome, campoNome, textoPreco, campoPreco, textoQuantidade, campoQuantidade };
		int okcancel = JOptionPane.showConfirmDialog(null, saida, "Adição de Produto", JOptionPane.OK_CANCEL_OPTION);

		if (okcancel == JOptionPane.OK_OPTION) {
			Produto produto = new Produto();

			produto.setCodigo(codigo);
			produto.setNome(campoNome.getText());
			produto.setPreco(Double.parseDouble(campoPreco.getText()));
			produto.setQuantidade(Integer.parseInt(campoQuantidade.getText()));

			Estoque.estoque.add(produto);

		} else {
			JOptionPane.showMessageDialog(null, "Operação cancelada! Voltando ao menu principal.");
		}
	}

	public void adicionarQuantidade() {
		int codigo = 0;
		boolean existe = false;
		do {
			codigo = Integer.parseInt(JOptionPane.showInputDialog("Insira o código para o produto a ser adicionado: "));
			for (Produto produto : Estoque.estoque) {
				if (produto.getCodigo() == codigo) {
					existe = true;
					int adicionar = Integer
							.parseInt(JOptionPane.showInputDialog("Insira a quantidade a ser adicionada: "));

					produto.setQuantidade(produto.getQuantidade() + adicionar);

					JOptionPane.showMessageDialog(null,
							"Foram adicionadas " + adicionar + " unidades de " + produto.getNome() + ".");
				}
			}
		} while (existe == false);
	}
}
