import java.util.Locale;
import java.util.Scanner;

public class Main1003 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float A = sc.nextFloat();
		float B = sc.nextFloat();
		float MEDIA = (float) (((A*3.5)+(B*7.5))/11.0);
				
		System.out.printf("MEDIA = %.5f%n" , MEDIA);
			
		sc.close();

	}

}
