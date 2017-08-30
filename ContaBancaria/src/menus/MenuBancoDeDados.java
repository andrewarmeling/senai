package menus;

import classesConta.Conta;
import bancoDeDados.ListaDeContas;

import javax.swing.*;

public class MenuBancoDeDados {

	public void exibirMenu() {

		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n\n" + "1 - Adicionar Conta \n"
				+ "2 - Listar Contas \n" + "3 - Excluir Conta \n" + "9 - Sair \n\n"));

		switch (escolha) {

		case 1:
			ListaDeContas listaDeContas = new ListaDeContas();
			listaDeContas.adicionarConta();
			break;
		}

	}

}
