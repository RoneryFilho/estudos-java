package exercicios_vetor;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAltura {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");

		
		double altMed = 0, menorIdade=0;
		int n = sc.nextInt();
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa\n", i+1);
			System.out.print("Nome: ");;
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
			altMed += alturas[i];
			if(idades[i]<16) {
				menorIdade++;
			}
		}
		
		altMed /= n;
		menorIdade = (menorIdade/n)*100;
		
		System.out.printf("Altura média: %.2f\n", altMed);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%% \n", menorIdade);
		for (int i = 0; i < n; i++) {
			if(idades[i]<16) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}
}
