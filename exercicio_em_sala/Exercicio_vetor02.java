package exercicio_em_sala;

import javax.swing.JOptionPane;

//Faça um algoritmo e um program que leia nome e salário de N 
//funcionários de uma empresa e armazene todos na memória 
//(utilize vetores). 
//Após altere o salário dos funcionários conforme a seguinte regra:
//a. Até R$ 400,00 + 25%;
//b. Até R$ 600,00 + 20%;
//c. Até R$ 800,00 + 15%;
//d. Demais + 10 %;

public class Exercicio_vetor02 {

	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("QT funcionarios:"));

		String[] nomes = new String[n];
		double[] salarios = new double[n];

		// CADASTRO
		for (int i = 0; i < n; i++) {
			nomes[i] = JOptionPane.showInputDialog("Nome");
			salarios[i] = Double.parseDouble(JOptionPane.showInputDialog("Salário"));
		}

		// REAJUSTA SALÁRIOS
		for (int i = 0; i < n; i++) {
			if (salarios[i] <= 400) {
				salarios[i] = salarios[i] * 1.25;
			} else {
				if (salarios[i] <= 600) {
					salarios[i] = salarios[i] * 1.2;
				} else {
					if (salarios[i] <= 800) {
						salarios[i] = salarios[i] * 1.15;
					} else {
						salarios[i] = salarios[i] * 1.10;
					}
				}
			}
		}
		// EXIBE OS SALÁRIOS
		String res = "";
		for (int i = 0; i < n; i++) {
			res += nomes[i] = " R$: " + salarios[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, res);

	}

}