package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Pratica_Nome_Do_Mais_Velho {
//Cria dois vetores com nome e idade e retorna o nome da pessoa mais velha.
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas deseja cadastrar? ");
		int N = sc.nextInt();

		String[] nomes = new String[N];
		int[] idades = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.print("Digite o nome: ");
			nomes[i] = sc.next();
			System.out.print("Digite a idade: ");
			idades[i] = sc.nextInt();
		}

		// 1: primeiro vamos encontrar a posicao da maior idade
		int maiorIdade = idades[0];
		int posicaoMaiorIdade = 0;

		for (int i = 1; i < N; i++) {
			if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				posicaoMaiorIdade = i;
			}
		}

		// 2: agora vamos acessar o vetor de nomes na posicao da maior idade
		System.out.println("Pessoa mais velha: " + nomes[posicaoMaiorIdade]);

		sc.close();
	}
}