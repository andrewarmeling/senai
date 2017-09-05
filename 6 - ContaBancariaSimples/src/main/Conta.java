package main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Conta {

	private String titularDaConta;
	private int tipoDaConta;
	private double saldo;
	private List<Movimentacao> listaDeMovimentacoes = new ArrayList<Movimentacao>();

	public void depositar(int valor) {

		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setValor(valor);
		movimentacao.setTipo(0);
		movimentacao.setData();

		setSaldo(getSaldo() + valor);

		listaDeMovimentacoes.add(movimentacao);

	}

	public void sacar(int valor) {

		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setValor(valor);
		movimentacao.setTipo(1);
		movimentacao.setData();

		setSaldo(getSaldo() - valor);

		listaDeMovimentacoes.add(movimentacao);

	}

	public void consultarSaldo() {

	}

	public void gerarExtrato() {
		String saida = "EXTRATO COMPLETO\n";

		for (Movimentacao movimentacao : listaDeMovimentacoes) {
			saida += "\n----------------------------\n";
			saida += "Data: " + movimentacao.getData() + "\n";
			saida += "Tipo: " + movimentacao.getTipoString() + "\n";
			saida += "Valor: R$" + movimentacao.getValor() + "\n";
		}

		saida += "----------------------------\n\n";
		saida += "Saldo atual: " + getSaldo();

		JOptionPane.showMessageDialog(null, saida);

	}

	public void gerarExtratoSaques() {
		String saida = "EXTRATO DE SAQUES\n";

		for (Movimentacao movimentacao : listaDeMovimentacoes) {
			if (movimentacao.getTipo() == 1) {
				saida += "\n----------------------------\n";
				saida += "Data: " + movimentacao.getData() + "\n";
				saida += "Valor: R$" + movimentacao.getValor() + "\n";
			}
		}

		saida += "----------------------------\n\n";
		saida += "Saldo atual: " + getSaldo();

		JOptionPane.showMessageDialog(null, saida);
	}

	public void gerarExtradoDepositos() {
		String saida = "EXTRATO DE DEPÓSITOS\n";

		for (Movimentacao movimentacao : listaDeMovimentacoes) {
			if (movimentacao.getTipo() == 0) {
				saida += "\n----------------------------\n";
				saida += "Data: " + movimentacao.getData() + "\n";
				saida += "Valor: R$" + movimentacao.getValor() + "\n";
			}
		}

		saida += "----------------------------\n\n";
		saida += "Saldo atual: " + getSaldo();

		JOptionPane.showMessageDialog(null, saida);
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

	public String getTipoString() {

		String saida = "";
		if (this.tipoDaConta == 0) {
			saida += "Conta Corrente";
		} else {
			saida += "Conta Poupança";
		}

		return saida;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
