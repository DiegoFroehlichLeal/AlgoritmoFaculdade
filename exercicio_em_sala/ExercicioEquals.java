/* Deve retornar se o e-mail � valido;
 * Regras:
 * Ter ao menos 10 caracteres;
 * Ter "." antes do "@";
 * Ter "@";
 * Ter ".com" apos o "@";
 * Antes do "@" deve ter ao menos 6 caracteres;
 */

package exercicio_em_sala;

import javax.swing.JOptionPane;

public class ExercicioEquals {

	public static void main(String[] args) {

		String mail = JOptionPane.showInputDialog("Digite seu e-mail: ");
		int posicaoArroba = mail.indexOf("@");
		String antesArroba = mail.substring(0, posicaoArroba);
		String depoisArroba = mail.substring(posicaoArroba, mail.length());
		if (mail.length() > 10) {
			if (mail.contains("@")) {
				if (antesArroba.contains(".")) {
					if (depoisArroba.contains(".com")) {
						if (antesArroba.length() > 6) {
							System.out.println("Este � um email v�lido");
						} else {
							System.out.println("O email n�o � um e-mail v�lido");
						}
					} else {
						System.out.println("O email n�o � um e-mail v�lido");
					}
				} else {
					System.out.println("O email n�o � um e-mail v�lido");
				}
			} else {
				System.out.println("O email n�o � um e-mail v�lido");
			}

		} else {
			System.out.println("O email n�o � um e-mail v�lido");
		}

	}
}
