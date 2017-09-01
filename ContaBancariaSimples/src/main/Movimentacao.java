package main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Movimentacao {

	private int tipo;
	private double valor;
	private String data;

	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTipoString() {
		String saida = "";

		if (this.getTipo() == 0) {
			saida += "Depósito";
		} else {
			saida += "Saque";
		}

		return saida;

	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getData() {
		return this.data;
	}

	public void setData() { // Questionar a respeito deste método
		String data = new SimpleDateFormat("dd.MM.yyyy - HH.mm.ss").format(new Date());
		this.data = data;
	}
}
