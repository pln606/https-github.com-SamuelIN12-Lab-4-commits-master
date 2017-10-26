import java.util.*;

public class Customer {

	private String name = "";
	private String address = "";
	private double creditRating = 0;
	private double discountRating = 0;

	public double getCreditRating() {
		return creditRating;	
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public double getDiscountRating() {
		if (creditRating == 0) {
			this.discountRating = 0.1;
		}
		else if (creditRating > 0) {
			this.discountRating = creditRating/100000;
		}
		return discountRating;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public void setCreditRating(double creditRating) {
		this.creditRating = creditRating;
	}

}