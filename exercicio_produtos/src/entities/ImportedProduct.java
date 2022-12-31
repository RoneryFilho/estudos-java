package entities;

public class ImportedProduct extends Product {

	private Double customFees;

	public ImportedProduct(String name, Double price, Double customFees) {
		super(name, price);
		this.customFees = customFees;
	}

	public double totalPrice() {
		return getPrice() + customFees;
	}

	@Override
	public String priceTag() {
		return getName() + " $ " + totalPrice() + "(Custems fee: $ " + customFees + ")";
	}

}
