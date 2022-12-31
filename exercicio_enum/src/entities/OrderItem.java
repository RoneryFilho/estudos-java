package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;

	private Product product;

	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public OrderItem(Integer quantity) {
		this.quantity = quantity;
	}

	public double subTotal() {
		return product.getPrice() * quantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return product.getName()
				+ ", $"
				+ String.format("%.2f", price) 
				+ ", Quantity: "
				+ quantity
				+ ", subtotal: $"
				+ String.format("%.2f", subTotal());
	}

}
