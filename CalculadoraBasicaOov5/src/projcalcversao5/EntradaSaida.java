package projcalcversao5;

import javax.swing.JOptionPane;

public class EntradaSaida {

	static int infonum1() {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o Primeiro número: "));
		return num1;

	}

	static int infonum2() {
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o Segundo número: "));
		return num2;
	}

	static int infop() {
		int acao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma operação: \n" + "1 - Soma \n"
				+ "2 - Subtração \n" + "3 - Multiplicação \n" + "4 - Divisão \n" + "5 - Sair do programa \n"));
		return acao;
	}

	static void mostraResultado(String saidaResultado) {
		JOptionPane.showMessageDialog(null, saidaResultado, "Resultado", JOptionPane.OK_CANCEL_OPTION);

	}
}
