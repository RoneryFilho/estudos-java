package entities;

public class Individual extends TaxPayer {
	
	private Double health;

	public Individual(String name, Double income, Double health) {
		super(name, income);
		this.health = health;
	}

	@Override
	public Double totalTaxes() {
		if (getIncome() < 20000) {
			return (getIncome() * 0.15) - health / 2;
		} else {
			return (getIncome() * 0.25) - health / 2;
		}
	}

}
