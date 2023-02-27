package perguntas;
/*
  Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a 
  soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
  escreva um programa na linguagem que desejar onde, informado um número, ele calcule a 
  sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou 
  não a sequência.

IMPORTANTE: 
	Esse número pode ser informado através de qualquer entrada de sua preferência ou pode 
	ser previamente definido no código;
 */

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num, fib1 = 0, fib2 = 1, aux;
		boolean pertence = false;

		System.out.println("Informe um número:");
		num = input.nextInt();

		while (fib2 < num) {
			aux = fib2;
			fib2 = fib1 + fib2;
			fib1 = aux;
		}

		if (fib2 == num || num == 0) {
			pertence = true;
		}

		if (pertence) {
			System.out.println(num + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println(num + " não pertence à sequência de Fibonacci.");
		}
		input.close();
	}
}
