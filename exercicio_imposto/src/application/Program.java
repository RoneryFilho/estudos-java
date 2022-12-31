package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<TaxPayer> taxes = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("Tax payer #%d data: \n", i + 1);
			System.out.print("Individual or company? (i/c): ");
			char ch = sc.next().charAt(0);

			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			if (ch == 'c') {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				taxes.add(new Company(name, income, employees));
			} else if (ch == 'i') {
				System.out.print("Health expanditures: ");
				double health = sc.nextDouble();
				taxes.add(new Individual(name, income, health));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");

		double totalTaxes = 0;

		for (TaxPayer payer : taxes) {
			System.out.printf("%s: $ %.2f\n", payer.getName(),payer.totalTaxes());
			totalTaxes += payer.totalTaxes();
		}

		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);

		sc.close();
	}
}
