package testes;

public class Teste_indexOf {

	public static void main(String[] args) {
		
		String x = "DiegoFroehlich1234";
		
		
		System.out.println(x.indexOf("F")); //ir� retornar 5 pois � a quinta posi��o contando de 0
		System.out.println(x.indexOf("F", 7));// ir� retornar -1 pois n�o existe o F apos a s�tima posi��o.
		
		

	}

}
