package exercicio_em_sala;

import javax.swing.JOptionPane;

//CADASTRAR N�MEROS PARES ANTES DOS IMPARES
public class Exercicio_vetor01 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("QT N�meros:"));
		int[] numeros = new int[n];
		int qtPar = 0;
		int qtImpar = n - 1;

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("N�"));
			if (num % 2 == 0) {
				numeros[qtPar] = num;
				qtPar++;
			} else {
				numeros[qtImpar] = num;
				qtImpar--;
			}
		}

		String res = "";
		for (int i = 0; i < n; i++) {
			res += numeros[i] + " ";
		}
		JOptionPane.showMessageDialog(null, res);
	}

}
