package calculadoraTeste;

import javax.swing.JOptionPane;

public class Divisao extends Operacao {
	public String calcular(int numero1, int numero2) {

		double dResultado = 0;
		String msg = "";

		if (numero2 != 0) {
			dResultado = numero1 / numero2;
			msg = "A divis�o �: " + dResultado;
		} else {
			JOptionPane.showMessageDialog(null, "ERRO DIVIS�O POR ZERO", "erro", JOptionPane.OK_CANCEL_OPTION);
		}
		return msg;

	}
}
