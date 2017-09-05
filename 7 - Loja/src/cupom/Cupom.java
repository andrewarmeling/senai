package cupom;

import java.util.ArrayList;
import java.util.List;

import venda.Venda;

public class Cupom {

	private List<Venda> cupom = new ArrayList<Venda>();

	public void adicionarVenda(Venda venda) {
		cupom.add(venda);
	}

	public List<Venda> getCupom() {
		return cupom;
	}
}
