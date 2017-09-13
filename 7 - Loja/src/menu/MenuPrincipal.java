package menu;

import javax.swing.JOptionPane;

import estoque.GerenciarEstoque;
import venda.Venda;
//import venda.Venda;
import venda.ListaDeCupons;
import venda.ListarCupons;

public class MenuPrincipal {

	public void exibirMenu() {
		while (true) {

			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção abaixo : \n\n"
					+ "1. Cadastrar produtos no estoque \n" + "2. Listar os produtos cadastrados no estoque \n"
					+ "3. Adicionar unidades a um produto já cadastrado \n" + "4. Venda (Gerar cupom) \n"
					+ "5. Somar total dos cupons gerados \n" + "9. Sair do Programa \n\n"));

			switch (opcao) {
			case 1:
				GerenciarEstoque ger1 = new GerenciarEstoque();
				ger1.adicionarProduto();
				break;

			case 2:
				GerenciarEstoque ger2 = new GerenciarEstoque();
				ger2.listarEstoque();
				break;

			case 3:
				GerenciarEstoque ger3 = new GerenciarEstoque();
				ger3.adicionarQuantidade();
				break;

			case 4:
				Venda venda = new Venda();
				venda.efetuarVenda();
				break;

			case 5:
				ListarCupons listar = new ListarCupons();
				listar.listarCupons();
				break;

			case 9:
				System.exit(0);

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida! Retornando ao menu.");
				break;
			}
		}
	}
}
