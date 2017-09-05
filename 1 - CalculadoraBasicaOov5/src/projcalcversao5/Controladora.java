package projcalcversao5;

import javax.swing.JOptionPane;

public class Controladora {

	public String calcular(int numero1, int numero2, int acao) {

		String mens = "";

		switch (acao) {

		case 1:
			Soma soma = new Soma();
			mens = soma.calcular(numero1, numero2);
			break;

		case 2:
			Subtracao subtracao = new Subtracao();
			mens = subtracao.calcular(numero1, numero2);
			break;

		case 3:
			Multiplicacao multiplicao = new Multiplicacao();
			mens = multiplicao.calcular(numero1, numero2);
			break;

		case 4:
			Divisao divisao = new Divisao();
			mens = divisao.calcular(numero1, numero2);
			break;

		case 5:
			System.exit(0);
			break;

		default:
			JOptionPane.showMessageDialog(null, "Opção Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
		}

		return mens;

	}
}
