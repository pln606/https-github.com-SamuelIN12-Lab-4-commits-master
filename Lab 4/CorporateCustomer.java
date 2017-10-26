import java.util.*;

public class CorporateCustomer extends Customer {
	String contactName = "";

	CorporateCustomer(String a, String name, String address) {
		setName(name);
		setAddress(address);
		this.contactName = a;
	}
}
