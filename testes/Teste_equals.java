package testes;

public class Teste_equals {

	public static void main(String[] args) {


		String primeiraPalavra = "Diego";
		String quartaPalavra = "DiEgo";

		//Neste caso ir� imprimir que s�o diferente pois .equals � case sensitive
		if (primeiraPalavra.equals(quartaPalavra)) {
			System.out.println("Ambas s�o iguais");
		}else {
			System.out.println("S�o diferentes");
		}


		//Neste caso ir� imprimir que s�o iguais pois o equalsIgnoreCase ir� ignorar maiuscula ou minuscula
		if (primeiraPalavra.equalsIgnoreCase(quartaPalavra)) {
			System.out.println("Ambas s�o iguais");
		}else {
			System.out.println("S�o diferentes");
		}


	}

}
