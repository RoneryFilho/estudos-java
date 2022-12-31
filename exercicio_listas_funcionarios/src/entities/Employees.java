package entities;

public class Employees {
	
	private String name;
	private int id;
	private double salary;
	
	public Employees(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void increaseSalary(double percent) {
		this.salary += this.salary*(percent/100);
		
	}

	public String toString() {
		return String.format("%d", id) + ", " + name + ", " + String.format("%.2f", salary) ;
	}
	
}
