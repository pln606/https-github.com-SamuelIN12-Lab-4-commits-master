import java.util.*;

public class Product {

	String name;
	double price;
	int productID;
	
	String getName() {
		return name;
	}
	double getPrice() {
		return price;
	}
	int getProductID() {
		return productID;
	}
	void setPrice(double price) {
		this.price = price;
	}
	void setName(String name) {
		this.name = name;
	}
	void setProductID(int productID) {
		this.productID = productID;
	}

}
