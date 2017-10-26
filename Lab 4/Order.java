import java.util.*;
import java.io.*;


public class Order{

	private Date today = new Date();
	private double price = 0;
	private int orderID = 0;
	private int quantity = 0;
	private boolean isCustomer;
	private Customer customer = new Customer();
	private ArrayList<OrderLine> orders = new ArrayList<OrderLine>();

	Order(Customer a) {
		this.customer = a;
		System.out.println("Order initialized, the date is: " + getDateRecieved());
	}
	
	public void addOrderLine(Product p, int q) {
		OrderLine temp = new OrderLine(p, q);
		this.orders.add(temp);
	}

	public Date getDateRecieved() {
		return today;
	}

	double calculatePrice() {
		
		System.out.println("Calculating price...");
		for (int i = 0; i < orders.size(); i++) {
			price += (orders.get(i).getPrice() * orders.get(i).getQuantity());
		}

				System.out.println("Calculating discount...");
		price = price - (price * customer.getDiscountRating());

		return (price);
	}
}