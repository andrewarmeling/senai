package calculadoraTeste;

import javax.swing.JOptionPane;

public class Controladora {

	public String calcular(int numero1, int numero2, int operacao) {

		String mens = "";

		Operacao oper = null;

		switch (operacao) {
		case 1:
			Soma soma = new Soma();
			oper = soma;
			break;

		case 2:
			Subtracao sub = new Subtracao();
			oper = sub;
			break;

		case 3:
			Multiplicacao multi = new Multiplicacao();
			oper = multi;
			break;

		case 4:
			Divisao divi = new Divisao();
			oper = divi;
			break;

		case 5:
			System.exit(0);
			break;

		default:
			JOptionPane.showMessageDialog(null, "Opção Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
			break;
		}

		if (oper != null) {

			mens = oper.calcular(int numero1, int numero2);
		}

		return mens;
	}

}
