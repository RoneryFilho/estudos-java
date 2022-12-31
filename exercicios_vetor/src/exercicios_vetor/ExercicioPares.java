package exercicios_vetor;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPares {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int paresFinal = 0, n = sc.nextInt();

		int[] numeros = new int[n];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}

		System.out.println("Numeros pares: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
				paresFinal++;
			}
		}
		
		System.out.println();
		System.out.println("Quantidade de pares = " + paresFinal);

		sc.close();
	}
}
