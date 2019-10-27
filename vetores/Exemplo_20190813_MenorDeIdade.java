package vetores;

import javax.swing.JOptionPane;

public class Exemplo_20190813_MenorDeIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de entradas: "));
		int[] idades = new int[n];

		for (int i = 0; i < idades.length; i++) {
			idades[i] = Integer.parseInt(JOptionPane.showInputDialog("idade: "));
		}

		int qtMenores = 0;
		for (int i = 0; i < idades.length; i++) {
			if (idades[i] < 18)
				qtMenores++;
		}
		JOptionPane.showMessageDialog(null, qtMenores + " São menores.");
	}

}
