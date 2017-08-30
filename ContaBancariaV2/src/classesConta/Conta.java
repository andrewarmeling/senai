package classesConta;

import java.util.List;

public class Conta {

//	Tipo 0 = Conta Corrente
//	Tipo 1 = Conta Poupança
//	
//	Tive problemas ao colocar CPF como Int
	
	private String titular;
	private long cpf;
	private int tipo;
	private double saldo;
	private List<Movimentacao> listaDeMovimentacoes;

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public long getCpf() {
		return this.cpf;
	}

	public void setCpf(long cpf) {
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
