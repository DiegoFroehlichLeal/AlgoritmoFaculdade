package matrizes;

import javax.swing.JOptionPane;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		double[][] notas = new double[5][3];
		
		//ENTRADA DE DADOS
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Nota"));
			}
		}
		
		String menuAluno = "1 - Pedro\n"
				+ "2 - João\n"
				+ "3 - Ana\n"
				+ "4 - José\n"
				+ "5 - Hamilton\n\n"
				+ "6 - SAIR";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menuAluno));
			double media = 0;
			for(int i=0; i<3; i++) {
				media += notas[op-1][i];
			}
			media = media/3;
			if(media < 3)
				JOptionPane.showMessageDialog(null, "REPROVADO(a)");
			else
				if(media >=7)
					JOptionPane.showMessageDialog(null, "APROVADO(a)");
				else
					JOptionPane.showMessageDialog(null, "RECUPERAÇÃO");
					
		}while(op!=6);
		
	}

}
