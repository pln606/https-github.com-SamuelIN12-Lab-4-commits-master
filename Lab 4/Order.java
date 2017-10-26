import java.util.*;


public class Order {

	Date dateRecieved;
	double price;
	int orderID;
	int quantity
	
	Date getDateRecieved() {
		return dateRecieved;
	}

	double calculatePrice() {
		//make rand order ID
		for (int i = 0; i < 10; i++) {
			OrderLine a = new OrderLine(item[i]);
			OrderApplication.item[i]

			quantity = a.getQuantity();
			price += a.getPrice();
		}

		PersonalCustomer pCust = new PersonalCustomer(54876463937373, "Lucio", "Tresendar Manor, Phandalin, Veil", 5000); 
		CorporateCustomer pCust = new PersonalCustomer("rmfCorp", "Lucio", "Tresendar Manor, Phandalin, Veil"); 


		return price;
	}
}