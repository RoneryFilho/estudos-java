package exercicios_vetor;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMediaPares {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int aux = 0, n = sc.nextInt();
		double pares = 0;

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			if (vect[i] % 2 == 0) {
				pares += vect[i];
				aux++;
			}
		}

		if (pares > 0) {
			System.out.printf("Media dos pares = %.1f\n", pares / aux);
		} else {
			System.out.println("Nenhum numero par");
		}

		sc.close();
	}
}
