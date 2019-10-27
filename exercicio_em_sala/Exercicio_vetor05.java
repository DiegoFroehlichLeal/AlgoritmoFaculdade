package exercicio_em_sala;

import javax.swing.JOptionPane;

//5 � Fa�a um algoritmo para cadastro de nomes e telefones de 
//pessoas (no m�ximo 100 pessoas) e que apresente o seguinte menu (com as respectivas funcionalidades):
//1 � Cadastrar contato 2 � Buscar contato por nome3 � Buscar contato por telefone4 � Sair
//Para o cadastro (op��o 1), solicitar o nome e o telefone cuidando do fato que n�o pode exceder 100 contatos. Para as buscas (op��es 2 e 3) deve mostrar o nome e o telefone de acordo com o filtro escolhido. Caso n�o exista o contato buscado, deve ser apresentada uma mensagem indicando a n�o exist�ncia desse contatos
public class Exercicio_vetor05 {

	public static void main(String[] args) {
		String[] nomes = new String[100];
		String[] telefones = new String[100];
		String menu = "1 - Cadastrar Contato\n" + "2 - Buscar por nome\n" + "3 - Buscar por Telefone\n" + "4 - Sair";
		int op = 0;
		int qt = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));

			if (op == 1) {
				if (qt < 100) {
					nomes[qt] = JOptionPane.showInputDialog("Nome (dispon�vel: " + (100 - qt) + ")");
					telefones[qt] = JOptionPane.showInputDialog("Telefone");
					qt++;
				} else {
					JOptionPane.showMessageDialog(null, "Limite Excedido");
				}
			}

			if (op == 2) {
				String nomeBusca = JOptionPane.showInputDialog("Iniciais do nome que deseja localizar?");
				String retorno = "";
				for (int i = 0; i < qt; i++) {
					if (nomes[i].startsWith(nomeBusca)) {
						retorno += nomes[i] + " - " + telefones[i] + "\n";
					}
				}
				if (retorno.equals(""))
					JOptionPane.showMessageDialog(null, "Contato n�o localizado");
				else
					JOptionPane.showMessageDialog(null, retorno);
			}
			if (op == 3) {
				String telBusca = JOptionPane.showInputDialog("Telefone que deseja localizar?");
				String retorno = "Contato n�o localizado!!!";
				for (int i = 0; i < qt; i++) {
					if (telefones[i].equalsIgnoreCase(telBusca)) {
						retorno = nomes[i] + " - " + telefones[i];
					}
				}
				JOptionPane.showMessageDialog(null, retorno);
			}

		} while (op != 4);
	}

}
