import java.util.*;

public class OrderLine {

	private int quantity = 0;
	private double price = 0;
	private Product product = new Product();
	
	OrderLine(Product product, int quantity) {
		this.quantity = quantity;
		this.product = product;
		this.price = this.product.getPrice();
	}

	public Product getProduct() {
		return product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
}