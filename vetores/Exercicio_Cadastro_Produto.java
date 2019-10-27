package vetores;

import javax.swing.JOptionPane;

public class Exercicio_Cadastro_Produto {

	public static void main(String[] args) {
		double[] precos = new double[50];
		int[] estoques = new int[50];
		int qt = 0;
		String menu = "1 - Cadastrar produto\n" + "2 - Mercadorias com menos de 10 unidades\n"
				+ "3 - Mais de R$ 100,00 e mais de 10 unidades\n" + "4 - Menor estoque\n" + "5 - Maior valor\n"
				+ "6 - % Estoque zerado\n\n" + "7 - SAIR";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));

			if (op == 1) {
				if (qt < 50) {
					String aviso = "Disponível " + (50 - qt) + " para cadasto\n";
					precos[qt] = Double.parseDouble(JOptionPane.showInputDialog(aviso + "Preco do produto:"));
					estoques[qt] = Integer.parseInt(JOptionPane.showInputDialog(aviso + "Estoque do produto:"));
					qt++;
				} else {
					JOptionPane.showMessageDialog(null, "Limite de cadastro excedido!!!");
				}
			}

			if (op == 2) {
				int qtMenor10 = 0;
				for (int i = 0; i < qt; i++) {
					if (estoques[i] < 10)
						qtMenor10++;
				}
				JOptionPane.showMessageDialog(null, qtMenor10 + " Mercadorias com menos de 10 unidades");
			}

			if (op == 3) {
				int qtResult = 0;
				for (int i = 0; i < qt; i++) {
					if (estoques[i] > 10 && precos[i] > 100)
						qtResult++;
				}
				JOptionPane.showMessageDialog(null,
						qtResult + " Mercadorias com mais de 10 unidades e que custam mais de R$ 100,00");
			}

			if (op == 4) {
				double menorEstoque = estoques[0];
				int posMenorEstoque = 0;
				for (int i = 1; i < qt; i++) {
					if (estoques[i] < menorEstoque) {
						menorEstoque = estoques[i];
						posMenorEstoque = i;
					}
				}
				JOptionPane.showMessageDialog(null,
						" O preço da mercadoria com menor estoque é R$: " + precos[posMenorEstoque]);
			}
			if (op == 5) {
				double maiorPreco = precos[0];
				int posMaiorPreco = 0;
				for (int i = 1; i < qt; i++) {
					if (precos[i] > maiorPreco) {
						maiorPreco = precos[i];
						posMaiorPreco = i;
					}
				}
				JOptionPane.showMessageDialog(null,
						" O estoque da mercadoria com maior preço: " + estoques[posMaiorPreco]);
			}
			if (op == 6) {
				int qtEstoqueZero = 0;
				for (int i = 0; i < qt; i++) {
					if (estoques[i] == 0) {
						qtEstoqueZero++;
					}
				}
				JOptionPane.showMessageDialog(null, " % mercadorias zerado: " + ((double) qtEstoqueZero / qt * 100));
			}

		} while (op != 7);
	}

}
