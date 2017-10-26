import java.io.*;
import java.util.*;
import java.nio.file.Paths;

public class OrderApplication {

	public ArrayList<Product> item = new ArrayList<Product>(10);
	boolean test;

	OrderApplication() {
		test = importCatalogue();
	}

	public boolean createOrder(Order a) {

		double cost = a.calculatePrice();
		System.out.println("The price is: " + cost + "\n");
		
		return true;
	}
	
	private boolean importCatalogue() {
		try {
			Scanner input = new Scanner(Paths.get("products.txt"));

			//gets rid of the first header line in the txt file
        	input.nextLine();
        	
        	System.out.println("Importing Catalogue...\n");     
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

		OrderApplication UI = new OrderApplication();
		System.out.println("\nCreating new customer...");   
		
		PersonalCustomer pCust = new PersonalCustomer(63937373, "Lucio", "Tresendar Manor, Phandalin, Veil", 5000); 

		//CorporateCustomer pCorp = new CorporateCustomer("A-Salt_Squad", "Lucio", "Tresendar Manor, Phandalin, Veil");  
		
		Order a = new Order(pCust); //to test corp customer uncomment above line of code and replace pCust here with pCorp

		System.out.println("Adding items to cart..."); 
		
		a.addOrderLine(UI.item.get(0), 2);
		a.addOrderLine(UI.item.get(1), 2);
		a.addOrderLine(UI.item.get(2), 2);
		a.addOrderLine(UI.item.get(3), 2);
		a.addOrderLine(UI.item.get(4), 2);
		a.addOrderLine(UI.item.get(5), 2);
		a.addOrderLine(UI.item.get(6), 2);
		a.addOrderLine(UI.item.get(7), 2);
		a.addOrderLine(UI.item.get(8), 2);
		a.addOrderLine(UI.item.get(9), 2);


		boolean t;
		t = UI.createOrder(a);
	}
	
}


