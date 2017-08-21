package classesFabrica;

import classesFabrica.Carro;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Fabrica {

	private String[] cores = { "Preto", "Verde", "Vermelho", "Amarelo", "Azul", "Branco", "Prata" };
	public List<Carro> listaDeCarros = new ArrayList<Carro>();

	public void fabricarCarros() {

		String modelo = JOptionPane.showInputDialog("Qual o modelo de carro deseja produzir?");
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos Carros deseja Fabricar?"));

		for (int i = 0; i < quantidade; i++) {

			String texto = "Qual a cor do " + (i + 1) + "º Carro?";
			JComboBox field1 = new JComboBox(cores);

			Object[] mensagem = { texto, field1 };

			int escolha = JOptionPane.showConfirmDialog(null, mensagem, "Escolha a cor", JOptionPane.OK_CANCEL_OPTION);

			Carro carro = new Carro();
			carro.setModelo(modelo);
			carro.setCor(cores[escolha]);
			listaDeCarros.add(carro);
		}

	}

	public void listarCarros() {

		String resultado = "";
		int contador = 0;

		System.out.println(listaDeCarros);

		for (Carro carro : listaDeCarros) {

		}

		JOptionPane.showMessageDialog(null, resultado);

	}

	public void venderCarros() {

	}
}
