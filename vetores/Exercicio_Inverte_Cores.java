package vetores;

// Aluno: Diego Froehlich Leal
import javax.swing.JOptionPane;

public class Exercicio_Inverte_Cores {

	public static void main(String[] args) {

		int quantidadeCor;
		String posicaoNoVetor = null;
		quantidadeCor = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas cores deseja informar?: "));

		String cores[] = new String[quantidadeCor];

		for (int i = 0; i < quantidadeCor; i++) {
			cores[i] = JOptionPane.showInputDialog(null, "Por favor digite a cor desejada: ");// irá montar o vetor,
																								// colocando cada imput
																								// do usuário dentro do
																								// vetor cores[i]

		}

		JOptionPane.showMessageDialog(null, cores); // irá mostrar o vetor originalmente digitado

		for (int i = 0; i < cores.length; i++) {
			for (int j = 0; j < i; j++) { // este bloco é o responsavel por inverter o vetor.
				posicaoNoVetor = cores[i];
				cores[i] = cores[j];
				cores[j] = posicaoNoVetor;
			}

		}
		JOptionPane.showMessageDialog(null, cores);// irá mostrar o vetor invertido

	}
}
