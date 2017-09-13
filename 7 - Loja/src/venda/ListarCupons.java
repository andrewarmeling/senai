package venda;

import javax.swing.JOptionPane;

public class ListarCupons {

	public void listarCupons() {
		Double total = 0.0;
		String resultado = "Relatório de cupons emitidos: \n\n";

		for (Cupom cupom : ListaDeCupons.listaDeCupons) {
			resultado += "Data: " + cupom.getData() + "\n";
			resultado += "Valor: " + cupom.getValorTotal() + "\n\n";
			total += cupom.getValorTotal();
		}

		resultado += "Valor total: " + total;
		JOptionPane.showMessageDialog(null, resultado);
	}
}
