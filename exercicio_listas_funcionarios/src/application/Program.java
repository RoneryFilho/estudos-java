package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();

		List<Employees> workerList = new ArrayList<Employees>();

		for (int i = 0; i < n; i++) {
			System.out.printf("Employee #%d\n", i + 1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			workerList.add(i, new Employees(name, id, salary));
			System.out.println();
		}
		
		System.out.print("Enter the employee id that will have a salary increase: ");
		int id = sc.nextInt();
		
		//se encontrar um elemento que o getId é igual ao id, associa na variavel e para, se nao associa null.
		Employees emp = workerList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		
		if (emp == null) {
			System.out.println("This id does not exist!");
			System.out.println();
		}else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
			System.out.println();
		}

		System.out.println("List of employees: ");
		for (Employees worker : workerList) {
			System.out.println(worker);
		}

		sc.close();
	}
}
