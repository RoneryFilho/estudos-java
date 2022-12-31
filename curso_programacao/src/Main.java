import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//Pode se escanear esses dados na mesma linha
		String x = sc.next();
		double y = sc.nextDouble();
		int z = sc.nextInt();
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		sc.close();
	}

}
