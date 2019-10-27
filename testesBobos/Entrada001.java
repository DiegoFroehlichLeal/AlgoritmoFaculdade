package testesBobos;

import java.util.Scanner;

public class Entrada001 {

	public static void main(String[] args) {

		String s1, s2, s3;

		Scanner sc = new Scanner(System.in);

		s1 = sc.next();
		sc.nextLine(); //consome a linha pendente
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}
