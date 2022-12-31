package exercicios_vetor;

import java.util.Locale;
import java.util.Scanner;

public class ExercícioSomaMedia {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double soma = 0;
		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}

		System.out.print("VALORES = ");
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + " ");
			soma += vect[i];
		}
		
		System.out.println();
		System.out.printf("SOMA = %.2f\n", soma);
		System.out.printf("MEDIA = %.2f\n", soma/n);

		sc.close();
	}
}
