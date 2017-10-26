import java.io.*;
import java.util.*;
import java.nio.file.Paths;

public class OrderApplication {

	public ArrayList<Product> item = new ArrayList<Product>(10);

	public boolean createOrder(Order a) {

		boolean test = importCatalogue();

		if (test == true) {
			System.out.println("Successful Import");
		}

		double cost = a.calculatePrice(item);
		System.out.println("Date: " + a.getDateRecieved());
		System.out.println(cost);

		return true;
	}
	
	boolean importCatalogue() {
		try {
			Scanner input = new Scanner(Paths.get("products.txt"));

			//gets rid of the first header line in the txt file
        	input.nextLine();
        	System.out.println("Importing Catalogue...");     
			for (int i = 0; i < 10; i++) {			
				Product a = new Product();
				a.setPrice(input.nextDouble());
				a.setName(input.next());
				a.setProductID(input.nextInt());
				item.add(a);
				System.out.println(item.get(i).getName()); 
			}

			input.close();

        }
        catch(FileNotFoundException ex) {
            System.out.println("ERROR: File Does Not Exist");                
        }
        catch(IOException ex) {
            System.out.println("ERROR: File Cannot be Read");                  

        }

        return true;
	}


	public static void main(String[] args) {

		

		System.out.println("Calculating Discount....");

		PersonalCustomer pCust = new PersonalCustomer(63937373, "Lucio", "Tresendar Manor, Phandalin, Veil", 5000); 

		CorporateCustomer pCorp = new CorporateCustomer("rmfCorp", "Lucio", "Tresendar Manor, Phandalin, Veil"); 

		System.out.println("Creating new order...");     
		Order a = new Order();
		OrderApplication UI = new OrderApplication();
		boolean t;
		t = UI.createOrder(a);
	}
	
}


