package vetores;

import javax.swing.JOptionPane;

public class Exercicio_Cores_Prefessor {

	public static void main(String[] args) {

		String[] cores = new String[10];
		int qt = 0;
		String cor = "";
		do {
			cor = JOptionPane.showInputDialog("Digite uma cor ou 0 para sair");
			if (!cor.equals("0")) {
				if (qt < 10) {
					cores[qt] = cor;
					qt++;
				} else {
					JOptionPane.showMessageDialog(null, "Limite excedido");
					cor = "0";
				}
			}
		} while (!cor.equals("0"));

		String result = "INFORMADAS PELO USUÁRIO\n";
		for (int i = 0; i < qt; i++) {
			result += cores[i] + " ";
		}
		JOptionPane.showMessageDialog(null, result);

		result = "ORDEM INVERSA\n";
		for (int i = qt - 1; i >= 0; i--) {
			result += cores[i] + " ";
		}
		JOptionPane.showMessageDialog(null, result);

	}

}
