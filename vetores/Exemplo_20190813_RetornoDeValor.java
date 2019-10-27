package vetores;

import javax.swing.JOptionPane;

public class Exemplo_20190813_RetornoDeValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nomes = new String[5]; // o [] diz que é um vetor

		for (int i = 0; i < 5; i++)
			nomes[i] = JOptionPane.showInputDialog("nome: " + (i + 1));

		JOptionPane.showMessageDialog(null, "Terceiro nome: " + nomes);
	}

}
