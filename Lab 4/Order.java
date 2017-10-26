import java.util.*;
import java.io.*;


public class Order{

	Date dateRecieved;
	double price = 0;
	int orderID = 0;
	int quantity = 0;
	boolean isCustomer;
	Customer customer = new Customer();
	ArrayList<OrderLine> orders = new ArrayList<OrderLine>();

	Order(Customer a) {
		this.customer = a;
	}
	
	void addOrderLine(Product p, int q) {
		OrderLine temp = new OrderLine(p, q);
		this.orders.add(temp);
	}

	Date getDateRecieved() {
		return dateRecieved;
	}

	double calculatePrice(ArrayList<Product> item) {
		//make rand order ID
		System.out.println("Adding items to cart and calculating price...");
		for (int i = 0; i < orders.size(); i++) {
			price += (orders.get(i).getPrice() * orders.get(i).getQuantity());
		}

		//System.out.println("Calculating Discount....");
		//PersonalCustomer pCust = new PersonalCustomer(63937373, "Lucio", "Tresendar Manor, Phandalin, Veil", 5000); 
		//pCust.getDiscountRating(1);
		//CorporateCustomer pCorp = new CorporateCustomer("rmfCorp", "Lucio", "Tresendar Manor, Phandalin, Veil"); 
		//price = price - (price * pCorp.getDiscountRating(0));

		return (price);
	}
}