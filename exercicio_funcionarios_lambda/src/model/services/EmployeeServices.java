package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Employee;

public class EmployeeServices {
	
	public double filteredSum(List<Employee> list, Predicate<Employee> criteria) {
		double sum = 0.0;
		for (Employee p : list) {
			if (criteria.test(p)) {
				sum += p.getSalary();
			}
		}
		return sum;
	}
	
}
