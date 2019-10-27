package testes;

public class Teste_equals {

	public static void main(String[] args) {


		String primeiraPalavra = "Diego";
		String quartaPalavra = "DiEgo";

		//Neste caso irá imprimir que são diferente pois .equals é case sensitive
		if (primeiraPalavra.equals(quartaPalavra)) {
			System.out.println("Ambas são iguais");
		}else {
			System.out.println("São diferentes");
		}


		//Neste caso irá imprimir que são iguais pois o equalsIgnoreCase irá ignorar maiuscula ou minuscula
		if (primeiraPalavra.equalsIgnoreCase(quartaPalavra)) {
			System.out.println("Ambas são iguais");
		}else {
			System.out.println("São diferentes");
		}


	}

}
