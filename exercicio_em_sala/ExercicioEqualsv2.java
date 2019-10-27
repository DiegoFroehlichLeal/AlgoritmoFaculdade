/* Deve retornar se o e-mail é valido;
 * Regras:
 * Ter ao menos 10 caracteres;
 * Ter "." antes do "@";
 * Ter "@";
 * Ter ".com" apos o "@";
 * Antes do "@" deve ter ao menos 6 caracteres;
 */

package exercicio_em_sala;

import javax.swing.JOptionPane;

public class ExercicioEqualsv2 {

	public static void main(String[] args) {

		String mail = JOptionPane.showInputDialog("Digite seu e-mail: ");
		int posicaoArroba = mail.indexOf("@");
		String antesArroba = mail.substring(0, posicaoArroba);
		String depoisArroba = mail.substring(posicaoArroba, mail.length());
		if (mail.length() > 10 && mail.contains("@") && antesArroba.contains(".") && depoisArroba.contains(".com")
				&& antesArroba.length() > 6) {
			System.out.println("Email Válido");
		} else {
			System.out.println("email não é válido");
		}
	}
}