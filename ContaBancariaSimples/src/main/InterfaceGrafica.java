package main;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import main.Conta;

public class InterfaceGrafica {

	Conta conta = criarConta();

	public void exibirMenu() {

		while (true) {
			int escolha = Integer.parseInt(JOptionPane.showInputDialog("Insira a opção Desejada :\n\n"
					+ "1 - Exibir Dados Da Conta \n" + "2 - Efetuar Depósito \n" + "3 - Efetuar Saque \n"
					+ "4 - Gerar Extrato Completo \n" + "5 - Gerar Extrato de Depósitos \n"
					+ "6 - Gerar Extrato de Saques \n" + "9 - Sair \n\n"));

			switch (escolha) {

			case 1:
				exibirDadosDaConta(conta);
				break;

			case 2:
				solicitarInformacoesDeposito();
				break;

			case 3:
				solicitarInformarcoesSaque();
				break;

			case 4:
				exibirExtratoCompleto();
				break;

			case 5:
				exibirExtratoDeDepositos();
				break;

			case 6:
				exibirExtratoDeSaques();
				break;

			case 9:
				System.exit(0);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida, retornando ao Menu.", "Erro!",
						JOptionPane.OK_OPTION);
			}
		}

	}

	private void exibirDadosDaConta(Conta conta) {

		String saida = "\n";

		saida += "Nome do Titular: " + conta.getTitular() + "\n";
		saida += "Tipo da Conta: " + conta.getTipoString() + "\n";
		saida += "Saldo atual: R$" + conta.getSaldo() + "\n";
		saida += "\n";

		JOptionPane.showMessageDialog(null, saida);
	}

	private void solicitarInformacoesDeposito() {

		int valor = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor a ser depositado: "));
		conta.depositar(valor);
		JOptionPane.showMessageDialog(null, "Foram depositados R$" + valor + ".");

	}

	private void solicitarInformarcoesSaque() {

		int valor = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor a ser sacado: "));

		if ((conta.getSaldo() - valor) < -1000.0) {
			JOptionPane.showMessageDialog(null, "Saldo/Crédito insuficiente. Operação cancelada.");
		} else {
			conta.sacar(valor);
			JOptionPane.showMessageDialog(null, "Foi sacado o valor de R$" + valor + ".");
		}
	}

	private void exibirExtratoCompleto() {
		conta.gerarExtrato();
	}

	private void exibirExtratoDeDepositos() {
		conta.gerarExtradoDepositos();
	}

	private void exibirExtratoDeSaques() {
		conta.gerarExtratoSaques();
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
