package venda;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import estoque.Estoque;
import estoque.Produto;

public class Venda {

	public void efetuarVenda() {

		Cupom cupom = new Cupom();
		cupom.setValorTotal(0.0);

		boolean continuarAdicionando = true;
		do {
			Produto produto = selecionarProduto();
			if (produto != null) {
				int quantidade = selecionarQuantidade(produto);
				removerProdutoDoEstoque(produto, quantidade);

				Item item = new Item();
				item.setProduto(produto.getNome());
				item.setQuantidade(quantidade);
				item.setValor(produto.getPreco());

				cupom.adicionarItem(item);
				Double soma = (item.getQuantidade() * item.getValor());
				soma += cupom.getValorTotal();
				cupom.setValorTotal(soma);

				int okcancel = JOptionPane.showConfirmDialog(null, "Deseja continuar adicionando produtos?");
				if (okcancel == JOptionPane.OK_OPTION) {
					continuarAdicionando = true;
				} else {
					continuarAdicionando = false;
				}
			} else {
				continuarAdicionando = false;
			}
		} while (continuarAdicionando == true);

		cupom.setData();
		ListaDeCupons.listaDeCupons.add(cupom);

		exibirCupom(cupom);
	}

	private Produto selecionarProduto() {

		Produto retorno = new Produto();

		String[] opcoes = new String[Estoque.estoque.size()];
		int contador = 0;
		for (Produto produto : Estoque.estoque) {
			opcoes[contador] = produto.getNome();
			contador += 1;
		}

		JComboBox box = new JComboBox(opcoes);
		int okcancel = JOptionPane.showConfirmDialog(null, box, "Selecione o produto: ", JOptionPane.OK_CANCEL_OPTION);

		if (okcancel == JOptionPane.OK_OPTION) {
			retorno = buscaProdutoPeloNome(opcoes[box.getSelectedIndex()]);
			return retorno;
		} else {
			JOptionPane.showMessageDialog(null, "Adição cancelada!");
			return null;
		}
	}

	private Produto buscaProdutoPeloNome(String nome) {
		Produto retorno = null;

		for (Produto produto : Estoque.estoque) {
			if (produto.getNome() == nome) {
				retorno = produto;
				break;
			}
		}

		return retorno;
	}

	private int selecionarQuantidade(Produto produto) {
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade desejada: "));
		while (quantidade < 0 || quantidade > produto.getQuantidade()) {
			quantidade = Integer.parseInt(JOptionPane.showInputDialog(
					"Quantidade indisponível! Insira um número maior que zero e menor ou igual à quantidade disponível: "));
		}
		return quantidade;
	}

	private void removerProdutoDoEstoque(Produto produto, int quantidade) {
		produto.setQuantidade(produto.getQuantidade() - quantidade);

		if (produto.getQuantidade() == 0) {
			Estoque.estoque.remove(produto);
		}
	}

	private void exibirCupom(Cupom cupom) {

		String resultado = "Cupom: \n";
		for (Item item : cupom.getListaDeItens()) {
			resultado += "Nome: " + item.getProduto() + "\n";
			resultado += "Quantidade: " + item.getQuantidade() + "\n";
			resultado += "SubTotal: " + (item.getQuantidade() * item.getValor()) + "\n\n";
		}

		resultado += "Valor total: " + cupom.getValorTotal();
		JOptionPane.showMessageDialog(null, resultado);
	}
}
