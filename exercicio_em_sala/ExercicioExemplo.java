
package exercicio_em_sala;

import javax.swing.JOptionPane;

public class ExercicioExemplo {

	public static void main(String[] args) {

		String nome, nomeMulherMaisVelha = null, nomeHomemMaisNovo = null;
		int idade = 0, menorDeIdade = 0, idadeHomem = 200, /* contadorMulher = 0, */ idadeMulher = 0, sexo = 0;
		double contadorHomem = 0;

		for (int i = 0; i < 5; i++) {

			nome = JOptionPane.showInputDialog("Nome: ");
			sexo = Integer.parseInt(JOptionPane.showInputDialog("[1]Masculino ou [2]Feminino?"));
			idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));

			if (idade < 18) {
				menorDeIdade++;
			}
			/*
			 * if (sexo == 2) { contadorMulher++; }
			 */
			if (sexo == 2 && idade > idadeMulher) {
				idadeMulher = idade;
				nomeMulherMaisVelha = nome;
			}
			if (sexo == 1) {
				contadorHomem++;
			}
			if (sexo == 1 && idade < idadeHomem) {
				idadeHomem = idade;
				nomeHomemMaisNovo = nome;
			}
		}
		JOptionPane.showMessageDialog(null,
				" O nome da mulher mais velha é: " + nomeMulherMaisVelha + "\n O nome do homem mais novo é: "
						+ nomeHomemMaisNovo + "\n O percentual de homens é de: " + contadorHomem / 5 * 100 + "\n "
						+ " Existem " + menorDeIdade + " menore(s) de 18 anos.");

	}
}
