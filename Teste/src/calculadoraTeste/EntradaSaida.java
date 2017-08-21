package calculadoraTeste;

import javax.swing.JOptionPane;

public class EntradaSaida {

	static int infonum1() {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número."));
		return num1;
	}

	static int infonum2() {
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número."));
		return num2;
	}

	static int infop() {

		int op = Integer.parseInt(JOptionPane.showInputDialog("Escolha o cálculo básico : \n" + "1. Soma \n"
				+ "2. Subtração \n" + "3. Multiplicação \n" + "4. Divisão \n" + "5. Sair do programa"));
		return op;
	}

	static void mostraResultado(String recmsgdresult) {
		JOptionPane.showMessageDialog(null, recmsgdresult, "Resultado", JOptionPane.OK_CANCEL_OPTION);

	}
}