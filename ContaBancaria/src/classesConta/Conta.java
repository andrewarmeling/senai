package classesConta;

import java.util.List;

public class Conta {

	private String titular;
	private int cpf;
	private int tipo;
	private double saldo;
	private List<Movimentacao> listaDeMovimentacoes;

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getCpf() {
		return this.cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public List<Movimentacao> getListaDeMovimentacoes() {
		return this.listaDeMovimentacoes;
	}

	public void adicionarMovimentacao(Movimentacao movimentacao) {
		listaDeMovimentacoes.add(movimentacao);
	}

	// public void setListaDeMovimentacoes(List<Movimentacao> lisdaDeMovimentacoes)
	// {
	//
	// }
	//
	// public Movimentacao getMovimentacao(Movimentacao movimentacao) {
	//
	// }
}
