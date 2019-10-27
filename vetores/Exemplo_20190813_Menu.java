package vetores;

//Cartão bandeira
import javax.swing.JOptionPane;

public class Exemplo_20190813_Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String menu = "1 -Inserir números\n" + "2 - Contar inpares e pares\n" + "3 - Sair";

		int[] numeros = new int[100];
		int qt = 0;
		int op = 0;

		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if (op == 1) {
				numeros[qt] = Integer.parseInt(JOptionPane.showInputDialog(qt));
				qt++;
			}
			if (op == 2) {
				int qtPares = 0;
				int qtImpares = 0;
				for (int i = 0; i < qt; i++) {
					if (numeros[i] % 2 == 0)
						qtPares++;
					else
						qtImpares++;
				}
				JOptionPane.showMessageDialog(null, "Pares: " + qtPares + "\n Impares" + qtImpares);
			}

		} while (op != 3);
	}

}
