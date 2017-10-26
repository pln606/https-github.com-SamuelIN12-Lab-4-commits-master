import java.util.*;


public class Order{

	Date dateRecieved;
	double price = 0;
	int orderID = 0;
	int quantity = 0;
	
	Date getDateRecieved() {
		return dateRecieved;
	}

	double calculatePrice(ArrayList<Product> item) {
		//make rand order ID
		for (int i = 0; i < 10; i++) {
			OrderLine a = new OrderLine(item.get(i));

			quantity = a.getQuantity();
			price += a.getPrice();
		}

		PersonalCustomer pCust = new PersonalCustomer(63937373, "Lucio", "Tresendar Manor, Phandalin, Veil", 5000); 
		pCust.getDiscountRating(1);
		CorporateCustomer pCrop = new CorporateCustomer("rmfCorp", "Lucio", "Tresendar Manor, Phandalin, Veil"); 
		price = price - (price * pCrop.getDiscountRating(0));



		return (price);
	}
}