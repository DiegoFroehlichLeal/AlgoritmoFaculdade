package testes;

import java.util.Scanner;

public class Teste_MaiorMenor {

	public static void main(String[] args) {

		int valor[] = new int[4];

		// primeiro obtenha o input sem fazer mais nada
		for (int i = 0; i < valor.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º valor: ");
			valor[i] = new Scanner(System.in).nextInt();
		}

// depois obtenha o maior e o menor
		int maior = valor[0];
		for (int i = 1; i < valor.length; i++) {
			if (valor[i] > maior) {
				maior = valor[i];
			}
		}

		int menor = valor[0];
		for (int i = 1; i < valor.length; i++) {
			if (valor[i] < menor) {
				menor = valor[i];
			}
		}
		System.out.println("Maior valor = " + maior);
		System.out.println("Menor valor = " + menor);
	}
}
