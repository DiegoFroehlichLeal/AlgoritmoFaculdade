package testesBobos;

import javax.swing.JOptionPane;

public class ExercicioMaxModularizacao {
	
	private static String[] nomes = new String[100];
	private static int[] dependentes = new int[100];
	private static double[] salarios = new double[100];
	private static double[] salariosAtu = new double[100];
	private static int qt = 0;
	
	
	public static void main(String[] args) {
		int op = 0;
		do {
			op = menu();
			
			if(op == 1) cadastra();
			if(op == 2) reajusta();
			if(op == 3) lista();
			
		}while(op != 4);
	}
	
	private static int menu() {
		String m = "1 - Cadastrar\n"
				+ "2 - Reajustar\n"
				+ "3 - Listar\n\n"
				+ "4 - SAIR";
		return leiaInteiro(m);
	}
	
	private static void cadastra() {
		if(qt < 100) {
			nomes[qt] = leiaStr("Nome");
			dependentes[qt] = leiaInteiro("Dep.");
			salarios[qt] = leiaDouble("Salário");
			qt++;
		}else {
			msg("Limite excedido");
		}
	}
	
	private static void reajusta() {
		double pcReajuste = 0;
		for(int i=0; i<qt; i++) {
			if(salarios[i] < 1000) {
				pcReajuste = 40 + dependentes[i];
			}else {
				if(salarios[i] > 3000) {
					pcReajuste = 20+ dependentes[i];
				}else {
					pcReajuste = 30+ dependentes[i];
				}
			}
			salariosAtu[i] = salarios[i]*pcReajuste/100 + salarios[i];
		}
	}
	
	private static void lista() {
		String ret = "";
		for(int i=0; i<qt; i++) {
			ret += nomes[i] + " - Salário antigo: "+salarios[i]+
					" - Salário Novo: "+salariosAtu[i]+"\n";
		}
		msg(ret);
	}
	
	private static int leiaInteiro(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	private static String leiaStr(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	private static double leiaDouble(String msg) {
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}
	
	private static void msg(String s) {
		JOptionPane.showMessageDialog(null, s);
	}

}
