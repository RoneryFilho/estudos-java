package entities;

public abstract class TaxPayer {
	private String name;
	private Double income;

	
	
	public TaxPayer(String name, Double income) {
		this.name = name;
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public Double getIncome() {
		return income;
	}
	
	public abstract Double totalTaxes();
}
