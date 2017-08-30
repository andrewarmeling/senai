package menus;

import javax.swing.JOptionPane;

public class MenuPrincipal {

	public void exibirMenu() {

		while (true) {

			int escolha = Integer.parseInt(JOptionPane.showInputDialog(
					"Escolha uma opção: \n\n" + "1 - Gerenciar Contas \n" + "2 - Menu de Conta \n" + "9 - Sair\n\n"));

			switch (escolha) {

			case 1:
				MenuBancoDeDados menuBanco = new MenuBancoDeDados();
				menuBanco.exibirMenu();
				break;

			case 2:
				MenuConta menuConta = new MenuConta();
				menuConta.exibirMenu();
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
