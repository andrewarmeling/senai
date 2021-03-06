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

			int opcao = JOptionPane.showConfirmDialog(null, mensagem, "Escolha a cor", JOptionPane.OK_CANCEL_OPTION);

			int escolha = 0;

			if (opcao == JOptionPane.OK_OPTION) {
				escolha = field1.getSelectedIndex();
			} else {
				JOptionPane.showMessageDialog(null, "Carro não adicionado! Fabricação interrompida!", "Erro!",
						JOptionPane.OK_OPTION);
			}

			Carro carro = new Carro();
			carro.setModelo(modelo);
			carro.setCor(cores[escolha]);
			listaDeCarros.add(carro);

		}

	}

	public void listarCarros() {

		String resultado = "";
		int contador = 0;

		for (Carro carro : listaDeCarros) {

			contador += 1;
			resultado += contador + " - " + carro.getModelo() + " - " + carro.getCor() + "\n";

		}

		JOptionPane.showMessageDialog(null, resultado);

	}

	public void venderCarros() {

		String[] modelosFiltrados = filtrarModelos();
		String modeloSelecionado = selecionarModelo(modelosFiltrados);
		String[] coresFiltradas = filtrarCores(modeloSelecionado);
		String corSelecionada = selecionarCor(coresFiltradas);

		removerCarro(modeloSelecionado, corSelecionada);

	}

	private String[] filtrarModelos() {

		List<String> modelosDisponiveis = new ArrayList<String>();

		for (Carro carro : listaDeCarros) {

			if (!modelosDisponiveis.contains(carro.getModelo())) {
				modelosDisponiveis.add(carro.getModelo());
			}
		}

		// Perguntar para o Silvio

		String[] retorno = new String[modelosDisponiveis.size()];
		retorno = modelosDisponiveis.toArray(retorno);

		return retorno;

	}

	private String[] filtrarCores(String modeloSelecionado) {

		List<String> coresDisponiveis = new ArrayList<String>();

		for (Carro carro : listaDeCarros) {

			if (carro.getModelo() == modeloSelecionado) {

				if (!coresDisponiveis.contains(carro.getCor())) {
					coresDisponiveis.add(carro.getCor());
				}
			}
		}

		String[] retorno = new String[coresDisponiveis.size()];
		retorno = coresDisponiveis.toArray(retorno);

		return retorno;

	}

	private String selecionarModelo(String[] modelosFiltrados) {

		String texto = "Qual modelo deseja vender?";
		JComboBox field1 = new JComboBox(modelosFiltrados);
		Object[] mensagem = { texto, field1 };
		int opcao = JOptionPane.showConfirmDialog(null, mensagem, "Escolha o Modelo", JOptionPane.OK_CANCEL_OPTION);

		int escolha = 0;

		if (opcao == JOptionPane.OK_OPTION) {
			escolha = field1.getSelectedIndex();
		} else {
			JOptionPane.showMessageDialog(null, "Operação cancelada. Venda interrompida!", "Erro!",
					JOptionPane.OK_OPTION);
		}

		return modelosFiltrados[escolha];
	}

	private String selecionarCor(String[] coresFiltradas) {

		String texto = "Qual a cor de preferência?";
		JComboBox field1 = new JComboBox(coresFiltradas);
		Object[] mensagem = { texto, field1 };
		int opcao = JOptionPane.showConfirmDialog(null, mensagem, "Escolha a cor", JOptionPane.OK_CANCEL_OPTION);

		int escolha = 0;

		if (opcao == JOptionPane.OK_OPTION) {
			escolha = field1.getSelectedIndex();
		} else {
			JOptionPane.showMessageDialog(null, "Operação cancelada. Venda interrompida!", "Erro!",
					JOptionPane.OK_OPTION);
		}

		return coresFiltradas[escolha];
	}

	private void removerCarro(String modeloSelecionado, String corSelecionada) {

		for (Carro carro : listaDeCarros) {
			if (carro.getModelo() == modeloSelecionado) {
				if (carro.getCor() == corSelecionada) {

					listaDeCarros.remove(carro);
					JOptionPane.showMessageDialog(null,
							"Foi vendido um " + modeloSelecionado + " na cor " + corSelecionada);
					break;
				}
			}
		}

	}
}
