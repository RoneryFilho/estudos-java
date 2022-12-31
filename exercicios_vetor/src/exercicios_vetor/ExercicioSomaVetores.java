package exercicios_vetor;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSomaVetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();

		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectC = new int[n];

		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < vectB.length; i++) {
			vectB[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vectC.length; i++) {
			vectC[i] = vectB[i] + vectA[i];
		}
		
		System.out.println("Vetor Resultante");
		for (int i = 0; i < n; i++) {
			System.out.println(vectC[i]);
		}

		sc.close();
	}
}
