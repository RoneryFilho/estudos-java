package exercicios_vetor;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMaior {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int posicao;
		double maior = 0;

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		maior = vect[0];
		posicao = 0;
		for (int i = 0; i < vect.length; i++) {
			if(vect[i] > maior) {
				maior = vect[i];
				posicao = i;
			}
		}
		
		System.out.printf("MAIOR VALOR = %.2f\n", maior);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicao);

		sc.close();
	}
}
