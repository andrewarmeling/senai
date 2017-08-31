package menu;

import javax.swing.JOptionPane;

import classesConta.ListaDeContas;
import menu.GerenciarContas;
import menu.MenuConta;

public class MenuPrincipal {

	ListaDeContas listaDeContas = new ListaDeContas();

	public void exibirMenu() {

		while (true) {

			while (true) {

				int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n\n"
						+ "1 - Gerenciar Contas \n" + "2 - Menu de Conta \n" + "9 - Sair\n\n"));

				switch (escolha) {

				case 1:
					GerenciarContas gerenciarContas = new GerenciarContas();
					gerenciarContas.exibirMenu(listaDeContas);
					break;

				case 2:
					MenuConta menuConta = new MenuConta();
					menuConta.exibirMenu(listaDeContas);
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

}
