package projcalcversao6;

import javax.swing.JOptionPane;

public class Controladora {

	public String calcular(int numero1, int numero2, int operacao) {

		String mens = "";
		switch (operacao) {

		case 1:
			Soma soma = new Soma();

			soma.ajustaValores(numero1, numero2);

			mens = soma.calcular();
			break;

		case 2:
			Subtracao sub = new Subtracao();
			sub.ajustaValores(numero1, numero2);

			mens = sub.calcular();
			break;

		case 3:
			Multiplicacao mult = new Multiplicacao();
			mult.ajustaValores(numero1, numero2);

			mens = mult.calcular();
			break;
		case 4:

			Divisao div = new Divisao();
			div.ajustaValores(numero1, numero2);

			mens = div.calcular();
			break;

		case 5:
			System.exit(0);
			break;

		default:
			JOptionPane.showMessageDialog(null, "Op��o Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);

			break;
		}
		return mens;
	}

}
