package entities;

public class Company extends TaxPayer {
	
	private Integer employees;

	public Company(String name, Double income, Integer employees) {
		super(name, income);
		this.employees = employees;
	}

	@Override
	public Double totalTaxes() {
		if (employees < 10) {
			return getIncome() * 0.16;
		} else {
			return getIncome() * 0.14;
		}
	}

}
