package classesConta;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ListaDeContas {

	List<Conta> listaDeContas = new ArrayList<Conta>();

	public List<Conta> getListaDeContas() {
		return this.listaDeContas;
	}

	public void adicionarConta() {

		String texto1 = "Insira seu nome completo: ";
		JTextField titular = new JTextField();

		String texto2 = "Insira seu número de CPF (Sem pontos ou vírgulas)";
		JTextField cpf = new JTextField();

		String texto3 = "Insira seu saldo inicial em Reais (Use ponto para separar os centavos): ";
		JTextField saldo = new JTextField();

		String texto4 = "Selecione o tipo da conta: ";
		String[] tipos = { "Conta Corrente", "Conta Poupança" };
		JComboBox tipo = new JComboBox(tipos);

		Object[] saida = { texto1, titular, texto2, cpf, texto3, saldo, texto4, tipo };

		int okcancel = JOptionPane.showConfirmDialog(null, saida, "Criação de Conta", JOptionPane.OK_CANCEL_OPTION);

		if (okcancel == JOptionPane.OK_OPTION) {

			boolean adicionar = false;
			for (Conta conta : listaDeContas) {
				if (conta.getCpf() != Double.parseDouble(cpf.getText())) {
					adicionar = true;
				} else {
					JOptionPane.showMessageDialog(null, "É permitida apenas uma conta por CPF! Operação cancelada!",
							"Erro!", JOptionPane.OK_OPTION);
					adicionar = false;
					break;
				}
			}

			if (adicionar == true) {
				Conta conta = new Conta();
				conta.setTitular(titular.getText());
				conta.setCpf(Long.parseLong(cpf.getText()));
				conta.setSaldo(Double.parseDouble(saldo.getText()));
				conta.setTipo(tipo.getSelectedIndex());

				listaDeContas.add(conta);

				JOptionPane.showMessageDialog(null, "Conta adicionada com sucesso!");
			}

		} else {
			JOptionPane.showMessageDialog(null, "Operação cancelada. Conta não adicionada.", "Cancelado",
					JOptionPane.OK_OPTION);
		}
	}

}
