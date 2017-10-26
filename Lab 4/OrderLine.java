import java.util.*;

public class OrderLine {

	int quantity;
	double price;
	Product product = new Product;
	
	OrderLine(Product product) {

		this.product = product;
		this.quantity = 0;
		this.price = 0;
	}
	
	int getQuantity() {
		//println("How many Products: ");
		//Scanner input = new Scanner;
		//input.nextln();

		this.quantity = 3;

		return quantity;
	}
	
	double getPrice() {
		price = product.getPrice()
		return price;
	}
	
}