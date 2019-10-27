package vetores;

import java.util.Scanner;

public class Pratica_Soma_Vetores {
// soma vetor A e B e cria um vetor C
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] A = new int[N];
		int[] B = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}

		// 1: gerando o vetor C
		int[] C = new int[N];
		for (int i = 0; i < N; i++) {
			C[i] = A[i] + B[i];
		}

		// 2: mostrando o vetor C na tela
		for (int i = 0; i < N; i++) {
			System.out.print(C[i] + " ");
		}
		System.out.println();

		sc.close();
	}
}