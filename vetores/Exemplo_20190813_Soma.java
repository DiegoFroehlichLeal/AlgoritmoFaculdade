package vetores;

import javax.swing.JOptionPane;

public class Exemplo_20190813_Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int soma = 0;
		int[] numeros = new int[10];
		for (int i = 0; i < 10; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(i + 1 + "Digite o numero "));
			soma += numeros[i];
		}
		JOptionPane.showMessageDialog(null, "A soma é: " + soma);

	}

}
