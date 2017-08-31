package main;

import java.util.List;

public class Conta {

	private String titularDaConta;
	private int tipoDaConta;
	private double saldo;
	private List<Movimentacao> listaDeMovimentacoes;

	public void depositar() {

	}

	public void sacar() {

	}

	public void consultarSaldo() {

	}

	public void gerarExtrato() {

	}

	public void gerarExtratoSaques() {

	}

	public void gerarExtradoDepositos() {

	}
	
	public String getTitular() {
		return this.titularDaConta;
	}

	public void setTitular(String titular) {
		this.titularDaConta = titular;
	}

	public int getTipo() {
		return this.tipoDaConta;
	}

	public void setTipo(int tipo) {
		this.tipoDaConta = tipo;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
