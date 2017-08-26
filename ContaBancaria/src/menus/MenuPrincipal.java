package menus;

import javax.swing.JOptionPane;

public class MenuPrincipal {

	public void exibirMenu() {

		while (true) {

			int escolha = Integer.parseInt(JOptionPane.showInputDialog(
					"Escolha uma opção: \n\n" + "1 - Gerenciar Contas \n" + "2 - Menu de Conta \n" + "9 - Sair"));

			switch (escolha) {

			case 1:
				GerenciarContas gerenciarContas = new GerenciarContas();
				gerenciarContas.exibirMenu();
				break;

			case 2:
				MenuDeConta menuDeConta = new MenuDeConta();
				menuDeConta.exibirMenu();
				break;

			case 9:
				System.exit(0);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		}
	}
}
