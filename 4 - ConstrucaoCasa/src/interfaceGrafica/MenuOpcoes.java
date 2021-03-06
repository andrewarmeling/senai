package interfaceGrafica;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import classesObjetosCasa.Casa;
import classesObjetosCasa.Janela;
import classesObjetosCasa.Porta;

public class MenuOpcoes {

	public void exibirMenu() {

		Casa casa = new Casa();
		while (true) {
			int acao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n \n" + "1 - Construir Casa \n"
					+ "2 - Pintar casa \n" + "3 - Mover Porta(s) \n" + "4 - Mover Janela(s) \n"
					+ "5 - Informações da Casa \n" + "6 - Sair do Programa"));

			switch (acao) {

			case 1:
				dadosConstCasa(casa);
				break;

			case 2:
				pintarCasa(casa);
				break;

			case 3:
				moverPorta(casa);
				break;

			case 4:
				moverJanela(casa);
				break;

			case 5:
				mostrarInformacoes(casa);
				break;

			case 6:
				System.exit(0);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
				break;

			}
		}
	}

	private void dadosConstCasa(Casa casa) {

		String descricao = JOptionPane.showInputDialog("Descrição da casa: ");
		String cor = JOptionPane.showInputDialog("Insira a cor da casa: ");
		int quantidadePorta = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de portas: "));
		int quantidadeJanela = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de janelas: "));

		List<Janela> listaDeJanelas = new ArrayList();
		List<Porta> listaDePortas = new ArrayList();

		for (int i = 0; i < quantidadeJanela; i++) {
			listaDeJanelas.add(solicitarJanelas(i));
		}

		for (int i = 0; i < quantidadePorta; i++) {
			listaDePortas.add(solicitarPortas(i));
		}

		casa.construirCasa(descricao, cor, listaDeJanelas, listaDePortas);

		/**
		 * 
		 * casa.setDescricao(descricao); casa.setCor(cor);
		 * casa.setListaDeJanelas(listaDeJanelas); casa.setListaDePortas(listaDePortas);
		 * 
		 * System.out.println(casa.getDescricao()); System.out.println(casa.getCor());
		 * 
		 * for (Janela janela : casa.getListaDeJanelas()) {
		 * System.out.println("Descrição: " + janela.getIdentificacao());
		 * System.out.println("Situação: " + janela.getStatus()); }
		 * 
		 * for (Porta porta : casa.getListaDePortas()) { System.out.println("Descrição:
		 * " + porta.getIdentificacao()); System.out.println("Situação: " +
		 * porta.getStatus()); }
		 * 
		 **/

	}

	private void pintarCasa(Casa casa) {
		if (casa.getCor() != null) {
			String cor = JOptionPane.showInputDialog("Digite a cor da casa: ");
			casa.pintarCasa(cor);
		} else {
			JOptionPane.showMessageDialog(null, "A casa ainda não foi construída!", "Erro", JOptionPane.OK_OPTION);
		}
	}

	private void moverPorta(Casa casa) {
		if (casa.getListaDePortas() == null) {
			JOptionPane.showMessageDialog(null, "A casa não tem portas!", "Erro!", JOptionPane.OK_CANCEL_OPTION);
		} else {
			JOptionPane.showMessageDialog(null, "A casa tem portas!", "OK", JOptionPane.OK_CANCEL_OPTION);

			List list = new ArrayList();

			for (Porta porta : casa.getListaDePortas()) {
				list.add(porta.getIdentificacao());
			}

			JComboBox field1 = new JComboBox(list.toArray());
			String[] listStatus = { "Aberto", "Fechada" };

			JComboBox field2 = new JComboBox(listStatus);
			Object[] message = { "Porta: ", field1, "Status: ", field2 };

			int option = JOptionPane.showConfirmDialog(null, message, "Porta", JOptionPane.OK_CANCEL_OPTION);

			if (option == JOptionPane.OK_OPTION) {
				int status;
				if (field2.getSelectedIndex() == 1) {
					status = 1;
				} else {
					status = 2;
				}

				casa.movimentarPorta(field1.getSelectedIndex(), status);

			}

		}
	}

	private void moverJanela(Casa casa) {
		if (casa.getListaDeJanelas() == null) {
			JOptionPane.showMessageDialog(null, "A casa não tem janelas!", "Erro!", JOptionPane.OK_CANCEL_OPTION);
		} else {
			JOptionPane.showMessageDialog(null, "A casa tem janelas!", "OK", JOptionPane.OK_CANCEL_OPTION);

			List list = new ArrayList();

			for (Janela janela : casa.getListaDeJanelas()) {
				list.add(janela.getIdentificacao());
			}

			JComboBox field1 = new JComboBox(list.toArray());
			String[] listStatus = { "Aberto", "Fechada" };

			JComboBox field2 = new JComboBox(list.toArray());
			Object[] message = { "Janela: ", field1, "Status: ", field2 };

			int option = JOptionPane.showConfirmDialog(null, message, "Janela", JOptionPane.OK_CANCEL_OPTION);

			if (option == JOptionPane.OK_OPTION) {
				int status;
				if (field2.getSelectedIndex() == 1) {
					status = 1;
				} else {
					status = 2;
				}

				casa.movimentarJanela(field1.getSelectedIndex(), status);

			}

		}
	}

	private void mostrarInformacoes(Casa casa) {

		if (casa.getDescricao() == null) {
			JOptionPane.showMessageDialog(null, "A casa ainda não foi construída!", "Erro!", JOptionPane.OK_OPTION);
		} else {

			String resultado = "<html>";

			resultado += "<b>Descrição</b>: " + casa.getDescricao() + "<br>";
			resultado += "<b>Cor: </b>" + casa.getCor() + "<br>";

			resultado += "<br>" + "<b>Portas: </b>" + "<br>";

			for (Porta porta : casa.getListaDePortas()) {

				resultado += "<br>";
				resultado += "Porta: " + porta.getIdentificacao() + "<br>";
				resultado += "Estado " + porta.getStatus() + "<br>";
				resultado += "<br>";
			}

			resultado += "<b>Janelas:</b>" + "<br>";

			for (Janela janela : casa.getListaDeJanelas()) {

				resultado += "Janela: " + janela.getIdentificacao() + "<br>";
				resultado += "Estado: " + janela.getStatus() + "<br>";
			}

			JOptionPane.showMessageDialog(null, resultado + "</html>");

		}
	}

	private Janela solicitarJanelas(int i) {

		Janela janela = new Janela();

		i += 1;

		String identificacao = JOptionPane.showInputDialog("Digite a descrição da janela " + (i) + ": ");
		int status = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite o status da janela " + identificacao + "\n" + "1 Para aberta \n" + "2 Para fechada: "));

		janela.setIdentificacao(identificacao);

		if (status == 1) {
			janela.setStatus(1);
		} else {
			janela.setStatus(2);
		}

		return janela;
	}

	private Porta solicitarPortas(int i) {

		Porta porta = new Porta();

		i += 1;

		String identificacao = JOptionPane.showInputDialog("Digite a descrição da porta " + (i) + ": ");
		int status = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite o status da porta " + identificacao + "\n" + "1 Para aberta \n" + "2 Para fechada: "));

		porta.setIdentificacao(identificacao);

		if (status == 1) {
			porta.setStatus(1);
		} else {
			porta.setStatus(2);
		}

		return porta;
	}
}
