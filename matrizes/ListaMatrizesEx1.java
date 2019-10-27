package matrizes;

public class ListaMatrizesEx1 {

	public static void main(String[] args) {
		double[][] m = new double[5][4];

		for (int i = 1; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				m[i][j] = i * (j / 2);
			}

		}

	}

}
