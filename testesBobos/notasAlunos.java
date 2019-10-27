package testesBobos;

import java.util.Scanner;

public class notasAlunos {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a nota 1: ");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a nota 2: ");
		double nota2 = sc.nextDouble();

		double notaFinal = (nota1 + nota2) / 2;

		System.out.println("Média Final: " +notaFinal);
		if (notaFinal < 70)
			System.out.println("Situação: Reprovado");
		else
			System.out.println("Situação: Aprovado");

		sc.close();
	}

}
