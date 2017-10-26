import java.util.*;

public class Customer {

	String name = "";
	String address = "";
	double creditRating = 0;
	double discountRating = 0;

	double getCreditRating() {
		return creditRating;	
	}
	String getName() {

		return name;
	}
	String getAddress() {

		return address;
	}

	double getDiscountRating() {

		if (creditRating != 0) {
			this.discountRating = 0.1;
		} else {
			this.discountRating = creditRating/100000;
		}

		return discountRating;
	}


	void setName(String name) {
		this.name = name;
	}
	void setAddress(String address) {
		this.address = address;

	}
	void setCreditRating(double creditRating) {
		this.discountRating = creditRating/100000;
	}

}