package venda;

import java.util.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Cupom {

	private List<Item> listaDeItens = new ArrayList<Item>();
	private Double valorTotal;
	private String data;

	public void adicionarItem(Item item) {
		listaDeItens.add(item);
	}

	public List<Item> getListaDeItens() {
		return listaDeItens;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getData() {
		return this.data;
	}

	public void setData() {
		String data = new SimpleDateFormat("dd.MM.yyyy - HH.mm.ss").format(new Date());
		this.data = data;
	}
}
