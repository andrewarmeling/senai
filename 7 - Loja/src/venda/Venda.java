package venda;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import estoque.Estoque;
import estoque.Produto;

public class Venda {

	private

	public void efetuarVenda() {
		boolean executar = true;

		do {
			int codigo = Integer.parseInt(
					JOptionPane.showInputDialog("Insira o código do produto a ser adicionado ou 0 para cancelar: "));

			if (codigo == 0) {
				executar = false;
			} else {
				Produto produto = Estoque.estoque.get(codigo);

				boolean continuar = false;
				do {
					int quantidade = Integer.parseInt(JOptionPane.showInputDialog(
							"Produto selecionado : " + produto.getNome() + "\n" + "Preço:" + produto.getPreco() + "\n"
									+ "Quantidade disponível: " + produto.getQuantidade() + "\n\n"));
					if ((produto.getQuantidade() - quantidade) >= 0) {

						Item item = new Item();
						item.setProduto(produto.getNome());
						item.setQuantidade(quantidade);

						continuar = true;
					} else {
						JOptionPane.showMessageDialog(null, "Produto indisponível nesta quantidade! Tente novamente.");
					}
				} while (continuar = false);
			}
		} while (executar == true);

	}
}
