package projcalcversao6;

public class Subtracao extends Operacao {

	public Subtracao() {

		m_numero1 = 0;
		m_numero2 = 0;
	}

	public String calcular() {

		double dResultado = 0;
		String msg = "";

		dResultado = m_numero1 - m_numero2;
		msg = "A subtra��o �: " + dResultado;
		return msg;
	}

}
