package interfaceGrafica;

import javax.swing.JOptionPane;
import classesFabrica.Fabrica;

public class Menu {

	public Fabrica fabrica = new Fabrica();

	public void exibirMenu() {

		while (true) {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha: \n\n" + "1 - Fabricar Carros \n"
					+ "2 - Listar Carros \n" + "3 - Vender Carro \n" + "9 - Sair do Programa"));

			switch (opcao) {

			case 1:
				fabrica.fabricarCarros();
				break;

			case 2:
				fabrica.listarCarros();
				break;

			case 3:
				fabrica.venderCarros();
				break;

			case 9:
				System.exit(0);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção não existente!", "Erro!", JOptionPane.OK_OPTION);
			}

		}

	}

}
