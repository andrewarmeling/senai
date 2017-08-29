package menus;

import classesConta.Conta;
import bancoDeDados.ListaDeContas;

import javax.swing.*;

public class MenuBancoDeDados {

	public void exibirMenu() {

		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n\n" + "1 - Adicionar Conta \n"
				+ "2 - Listar Contas \n" + "3 - Excluir Conta \n" + "9 - Sair"));

		switch (escolha) {

		case 1:

			JTextField titular = new JTextField();
			JTextField cpf = new JTextField();
			JTextField saldo = new JTextField();
			String[] tipos = { "Conta Corrente", "Conta Poupança" };
			JComboBox tipo = new JComboBox(tipos);

			JPanel saida = new JPanel();
			saida.setLayout(new BoxLayout(saida, BoxLayout.Y_AXIS));

			saida.add(new JLabel("Insira seu nome completo:  "));
			saida.add(titular);
			saida.add(new JLabel("Insira seu número de CPF (Sem traços ou pontos): "));
			saida.add(cpf);
			saida.add(new JLabel("Insira o saldo inicial (Em R$, sem vírgulas. Ponto divide Reais de Centavos): "));
			saida.add(saldo);
			saida.add(new JLabel("Selecione o tipo de conta: "));
			saida.add(tipo);

			int okcancel = JOptionPane.showConfirmDialog(null, saida, "Criação de Conta", JOptionPane.OK_OPTION);

			if (okcancel == JOptionPane.OK_OPTION) {
				Conta conta = new Conta();
				conta.setTitular(titular.toString());
				conta.setCpf(Integer.parseInt(cpf.toString()));
				conta.setSaldo(Double.parseDouble(saldo.toString()));
				conta.setTipo(tipo.getSelectedIndex());

				JOptionPane.showMessageDialog(null, "Conta criada com sucesso!");
			} else {
				JOptionPane.showMessageDialog(null, "Conta não criada. Operação cancelada.", "Erro!",
						JOptionPane.OK_OPTION);
			}

		}

	}

}
