package testes;

public class Teste_indexOf {

	public static void main(String[] args) {
		
		String x = "DiegoFroehlich1234";
		
		
		System.out.println(x.indexOf("F")); //irá retornar 5 pois é a quinta posição contando de 0
		System.out.println(x.indexOf("F", 7));// irá retornar -1 pois não existe o F apos a sétima posição.
		
		

	}

}
