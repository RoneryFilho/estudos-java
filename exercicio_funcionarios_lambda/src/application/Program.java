package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;
import model.services.EmployeeServices;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double totalSalaryM = 0.0;
		List<String> salaryMoreThan = new ArrayList<>();
		

		System.out.print("Diretório: ");
		String path = sc.nextLine();

		System.out.print("Enter salary: ");
		double salaryInput = sc.nextDouble();

		List<Employee> employees = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String[] fields = line.split(",");
				employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}

			salaryMoreThan = employees.stream().filter(e -> e.getSalary() > salaryInput).map(e -> e.getEmail())
					.collect(Collectors.toList());

			EmployeeServices emp = new EmployeeServices();
			totalSalaryM = emp.filteredSum(employees, e -> e.getName().charAt(0) == 'M');

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println("Email of people whose salary is more than 2000.00: ");
		salaryMoreThan.forEach(System.out::println);
		
		System.out.printf("Sum of salary of people whose name starts with 'M': %.2f", totalSalaryM);

		sc.close();
	}

}
