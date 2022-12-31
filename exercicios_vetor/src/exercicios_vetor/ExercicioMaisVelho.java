package exercicios_vetor;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMaisVelho {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt(), maisVelho = 0;
		
		String nomeMaisVelho = "";
		String[] nomes = new String[n];
		int[] idades = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da a pessoa\n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if(idades[i]>maisVelho) {
				maisVelho = idades[i];
				nomeMaisVelho = nomes[i];
			}
		}
		
		System.out.println("Pessoa mais velha: " + nomeMaisVelho);
		
		sc.close();
	}
}