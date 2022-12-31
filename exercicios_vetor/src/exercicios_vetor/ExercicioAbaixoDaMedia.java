package exercicios_vetor;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAbaixoDaMedia {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double valorVetor = 0;

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			valorVetor += vect[i];
		}

		System.out.printf("Media do vetor = %.3f\n", valorVetor / n);
		System.out.println("Elementos abaixo da média:");
		for (int i = 0; i < vect.length; i++) {
			if(vect[i]<(valorVetor/n)) {
				System.out.println(vect[i]);
			}
		}

		sc.close();
	}
}
