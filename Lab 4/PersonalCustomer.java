
import java.util.*;

public class PersonalCustomer extends Customer{

	private int creditCardNumber = 0;

	PersonalCustomer(int a, String name, String address, double credit) {
		this.creditCardNumber = a;
		setName(name);
		setAddress(address);
		setCreditRating(credit);
	}

}

