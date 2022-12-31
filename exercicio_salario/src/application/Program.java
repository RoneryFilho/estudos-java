package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Salary;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Salary sal = new Salary();
		
		System.out.print("Name: ");
		sal.name = sc.nextLine();
		System.out.print("Gross salary: ");
		sal.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		sal.tax = sc.nextDouble(); 
		
		System.out.printf("Employee: %s, $ %.2f\n", sal.name, sal.netSalary());
		
		System.out.print("Wich percentage to increase the salary? : ");
		double perc = sc.nextDouble();
		sal.increaseSalary(perc);
		System.out.printf("Updated data: %s, $ %.2f\n", sal.name, sal.netSalary());
		
		sc.close();
	}
}
