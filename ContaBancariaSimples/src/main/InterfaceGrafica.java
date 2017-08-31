package main;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import main.Conta;

public class InterfaceGrafica {

	public void exibirMenu() {

		Conta conta = criarConta();

	}

	private void solicitarInformacoesDeposito() {

	}

	private void solicitarInformarcoesSaque() {

	}

	private void exibirDadosDaConta() {

	}

	private void exibirExtratoCompleto() {

	}

	private void exibirExtratoDeDepositos() {

	}

	private void exibirExtratoDeSaques() {

	}

	private Conta criarConta() {
		String texto1 = "Insira seu nome completo: ";
		JTextField titular = new JTextField();

		String texto2 = "Insira seu saldo inicial em Reais (Use ponto para separar os centavos): ";
		JTextField saldo = new JTextField();

		String texto3 = "Selecione o tipo da conta: ";
		String[] tipos = { "Conta Corrente", "Conta Poupança" };
		JComboBox tipo = new JComboBox(tipos);

		Object[] saida = { texto1, titular, texto2, saldo, texto3, tipo };

		int okcancel = JOptionPane.showConfirmDialog(null, saida, "Criação de Conta", JOptionPane.OK_CANCEL_OPTION);

		if (okcancel == JOptionPane.CANCEL_OPTION) {
			System.exit(0);
		}

		Conta conta = new Conta();

		conta.setTitular(titular.getText());
		conta.setSaldo(Double.parseDouble(saldo.getText()));
		conta.setTipo(tipo.getSelectedIndex());

		JOptionPane.showMessageDialog(null, "Conta adicionada com sucesso!");

		return conta;
	}

}
