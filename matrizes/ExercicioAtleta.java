package matrizes;

import javax.swing.JOptionPane;

public class ExercicioAtleta {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Qts Atletas?"));

		String[] nomes = new String[n];
		int[][] tempo = new int[n][8];

		// ENTRADA DE DADOS
		for (int i = 0; i < n; i++) {
			nomes[i] = JOptionPane.showInputDialog("Nome do Atleta");
			for (int j = 0; j < 8; j++) {
				tempo[i][j] = Integer
						.parseInt(JOptionPane.showInputDialog("Tempo da maratona [" + (j + 1) + "] de " + nomes[i]));
			}
		}
		int maratona = 0;

		do {
			maratona = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº da maratona ou 0 para sair"));

			String resultado = "Tempo da maratona" + maratona + "\n";
			for (int i = 0; i < n; i++) {
				resultado += nomes[i] + " - " + tempo[i][maratona - 1] + "\n";
			}
			JOptionPane.showMessageDialog(null, resultado);

		} while (maratona != 0);

	}
}
