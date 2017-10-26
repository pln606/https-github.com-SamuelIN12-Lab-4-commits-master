import java.util.*;

public class Customer {

	String name;
	String address;
	float creditRating;
	float discountRating;

	float getCreditRating() {
		return creditRating;	
	}
	String getName() {

		return name;
	}
	String getAddress() {

		return address;
	}

	float getDiscountRating(int test) {

		if (test == 0) {
			this.discountRating = 0.1;
		} else {
			this.discountRating = creditRating/100000;
		}

		return discountRating;
	}


	String setName(String name) {
		this.name = name;
	}
	String setAddress(String address) {
		this.address = address;
		return address;
	}
	float setCreditRating(float creditRating) {
		this.discountRating = creditRating/100000;
		return discountRating;
	}

}