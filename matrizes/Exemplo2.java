package matrizes;

import javax.swing.JOptionPane;

public class Exemplo2 {
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Qt Alunos?"));
		
		String[] nomes = new String[n];
		double[][] notas = new double[n][3];
		
		//****ENTRADA DE DADOS
		for(int i=0; i<n; i++) {
			//SEMPRE QUE TROCAR A LINHA PERGUNTA O NOME DO ALUNO
			nomes[i] = JOptionPane.showInputDialog("Nome do aluno");
			for(int j=0; j<3; j++){
				//NOTA DE CADA ALUNO
				notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog(
						"Nota ["+(j+1)+"] de "+nomes[i]));
			}
		}
		
		//BUSCA POR ALUNOS - CARTÃO BANDEIRA
		String nomeBusca = "";
		do {
			nomeBusca = JOptionPane.showInputDialog("Nome ou 0 para sair");
			if(!nomeBusca.equals("0")) {
				int pos = -1;//inicializa a posição que se encontra o aluno, ou seja, nula
				//percorre o vetor de nomes em busca daquele aluno
				for(int i=0; i<n; i++) {
					if(nomeBusca.equalsIgnoreCase(nomes[i])) {
						//caso encontre guarda a posição em que o aluno está no vetor
						pos = i;
					}
				}
				if(pos == -1) {
					JOptionPane.showMessageDialog(null, "Aluno não encontrado");
				}else {
					
					double media = 0;
					//percorre as colunas da linha do aluno [pos] na matriz
					for(int i=0; i<3; i++) {
						media += notas[pos][i];
					}
					//verifica aprovação ou não
					media = media/3;
					if(media < 3)
						JOptionPane.showMessageDialog(null, nomes[pos]+" REPROVADO(a)");
					else
						if(media >=7)
							JOptionPane.showMessageDialog(null,  nomes[pos]+" APROVADO(a)");
						else
							JOptionPane.showMessageDialog(null,  nomes[pos]+" RECUPERAÇÃO");
				}
			}
		}while(!nomeBusca.equals("0"));
		
	}

}
