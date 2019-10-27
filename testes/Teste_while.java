package testes;

import java.util.Scanner;

public class Teste_while {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int soma = 0;

		int x = sc.nextInt();

		while (x != 0) {
			soma = soma + x; // ou += x;
			x = sc.nextInt();

		}
		System.out.println(soma);
		sc.close();

	}

}
