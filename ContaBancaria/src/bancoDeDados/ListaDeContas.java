package bancoDeDados;

import java.util.List;
import classesConta.Conta;

public class ListaDeContas {

	private List<Conta> listaDeContas;

	public List<Conta> getListaDeContas() {
		return this.listaDeContas;
	}
	
//	public void setListaDeContas(List<Conta> listaDeContas) {
//		this.listaDeContas = listaDeContas;
//	}
	
	public void adicionarConta(Conta conta) {
		listaDeContas.add(conta);
	}
	
}
