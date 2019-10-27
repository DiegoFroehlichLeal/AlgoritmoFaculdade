package matrizes;

import javax.swing.JOptionPane;

public class Exemplo1 {
	
	public static void main(String[] args) {
		double[][] gastos = new double[12][4];
		
		//ENTRADA DE DADOS (CADASTRO)
		
		for(int i=0; i<12; i++) {
			for(int j = 0; j<4; j++) {
				gastos[i][j] = Double.parseDouble
						(JOptionPane.showInputDialog("Valor:"));
			}
		}
		
		int mes = 0;
		do {
			mes = Integer.parseInt(JOptionPane.showInputDialog("Número do Mês ou 0 para sair"));
			double soma = 0;
			for(int i = 0; i<4; i++ ) {
				soma += gastos[mes-1][i];
			}
			JOptionPane.showMessageDialog(null, "Gastos do Mes" 
			+ mes+": R$"+ soma );
		}while(mes != 0);
		
		double gastoAnual = 0;
		for(int i=0; i<12; i++) {
			for(int j = 0; j<4; j++) {
				gastoAnual += gastos[i][j];
			}
		}
		JOptionPane.showMessageDialog(null, "Gastos do ano: R$"
		+ gastoAnual );
	}

}
