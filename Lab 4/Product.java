import java.util.*;

public class Product {

	private String name = "";
	private double price = 0;
	private int productID = 0;
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getProductID() {
		return productID;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}

}
