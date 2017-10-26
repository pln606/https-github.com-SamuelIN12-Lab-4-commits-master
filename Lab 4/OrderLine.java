import java.util.*;

public class OrderLine {

	int quantity = 0;
	double price = 0;
	Product product = new Product();
	
	OrderLine(Product product) {

		this.product = product;
		this.price = product.getPrice();
	}
	
	int getQuantity() {
		//println("How many Products: ");
		//Scanner input = new Scanner;
		//input.nextln();

		this.quantity = 3;

		return quantity;
	}
	
	double getPrice() {
		return price;
	}
	
}