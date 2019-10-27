package testesBobos;

import java.util.Scanner;

public class diaTardeNoite {

	public static void main(String[] args) {
		int hora;
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual hora?");
		hora = sc.nextInt();

		if (hora < 12)
			System.out.println("Bom dia");
		else if (hora >= 18)
			System.out.println("Boa noite");
		else
			System.out.println("Boa tarde");

		sc.close();
	}

}
