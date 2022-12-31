package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrencyConverter currency = new CurrencyConverter();
		
		System.out.print("What is the dolar price? ");
		currency.dolarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		currency.amount = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f", currency.finalAmount());
		
		sc.close();
	}
}
