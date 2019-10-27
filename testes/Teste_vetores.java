package testes;

import java.util.Locale;
import java.util.Scanner;

public class Teste_vetores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // define o tamanho do vetor

		double[] vet = new double[N]; // cria o vetor

		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble();// input do usuario para o vetor

		}

		for (int i = 0; i < N; i++) { // imprime o vetor, precisa do for pra imprimir
			System.out.printf("%.2f%n", vet[i]);// formatado para 2 casas decimais
		}

		sc.close();
	}

}
