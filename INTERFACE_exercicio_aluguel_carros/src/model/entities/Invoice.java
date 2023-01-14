package model.entities;

public class Invoice {
	private Double basicPayment;
	private Double tax;

	public Invoice() {
	}

	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public Double getTotalPayment() {
		return getBasicPayment() + getTax(); // usando os gets para caso altere a lógica do tax no futuro, não precisar
												// alterar o totalPayment
	}
}
