import java.util.Locale;
import java.util.Scanner;

public class Main1038 {

	public static void main(String[] args) {
		final float A = 4.00f, B = 4.50f, C = 5.00f, D = 2.00f, E = 1.50f;
		float pedidoTotal, item = 0;
		int entrada, quant;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		entrada = sc.nextInt();
		quant = sc.nextInt();
		if (entrada == 1)
			item = A;
		if (entrada == 2)
			item = B;
		if (entrada == 3)
			item = C;
		if (entrada == 4)
			item = D;
		if (entrada == 5)
			item = E;

		pedidoTotal = item * quant;

		System.out.printf("Total: R$ %.2f%n", pedidoTotal);

		sc.close();
	}

}
