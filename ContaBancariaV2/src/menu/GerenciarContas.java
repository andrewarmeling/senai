package menu;

import javax.swing.JOptionPane;

import classesConta.ListaDeContas;

public class GerenciarContas {

	public void exibirMenu(ListaDeContas listaDeContas) {
		
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n\n" + "1 - Adicionar Conta \n"
				+ "2 - Listar Contas \n" + "3 - Excluir Conta \n" + "9 - Sair \n\n"));

		switch (escolha) {
		
		case 1:
			listaDeContas.adicionarConta();
			break;
			
		case 2:
		
		
		}
	}

}
