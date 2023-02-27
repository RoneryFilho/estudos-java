package application;

import java.text.Format;
import java.util.Scanner;
import java.util.Stack;

/*Os programas estão separados no pacote "perguntas", apenas copie e colar os códigos para
a main e rode o programa*/
public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String frase = "Frase sendo invertida legal uau";
		String fraseInvertida = "";

		for (int i = frase.length(); i > 0; i--) {
			fraseInvertida = fraseInvertida.concat(String.valueOf(frase.charAt(i-1)));
		}
		
		System.out.printf("String: %s\n", frase);
		System.out.printf("String invertida: %s",fraseInvertida);
		
		sc.close();
	}
}