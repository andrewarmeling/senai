package projcalcversao5;

public class Comunicadora {

	public void executar() {

		while (true) {
			int numero1 = EntradaSaida.infonum1();
			int numero2 = EntradaSaida.infonum2();
			int acao = EntradaSaida.infop();

			Controladora controle = new Controladora();

			String msg = controle.calcular(numero1, numero2, acao);

			EntradaSaida.mostraResultado(msg);
		}
	}

}
