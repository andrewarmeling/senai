package cupom;

import java.util.List;
import java.util.ArrayList;

public class Cupom {

	private List<Item> listaDeItens = new ArrayList<Item>();

	public void adicionarItem(Item item) {
		listaDeItens.add(item);
	}
}
