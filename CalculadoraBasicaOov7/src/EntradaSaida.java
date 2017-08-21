

import javax.swing.JOptionPane;

public class EntradaSaida {

	static int infonum1() {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro n�mero."));
		return num1;
	}

	static int infonum2() {
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo n�mero."));
		return num2;
	}

	static int infop() {

		int op = Integer.parseInt(JOptionPane.showInputDialog("Escolha o c�lculo b�sico : \n" + "1. Soma \n"
				+ "2. Subtra��o \n" + "3. Multiplica��o \n" + "4. Divis�o \n" + "5. Sair do programa"));
		return op;
	}

	static void mostraResultado(String recmsgdresult) {
		JOptionPane.showMessageDialog(null, recmsgdresult, "Resultado", JOptionPane.OK_CANCEL_OPTION);

	}
}