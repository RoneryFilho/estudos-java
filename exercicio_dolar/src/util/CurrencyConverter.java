package util;

public class CurrencyConverter {

	public double dolarPrice;
	public double amount;
	public static final double taxes = 0.06;

	public double finalAmount() {
		return dolarPrice * amount + (dolarPrice * amount) * taxes;
	}

}
