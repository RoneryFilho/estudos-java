package exercicios_vetor;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioNegativos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		for (int i = 0; i < vect.length; i++) {
			if(vect[i]<0) {
				System.out.println(vect[i]);
			}
		}

		System.out.println();

		sc.close();
	}
}
