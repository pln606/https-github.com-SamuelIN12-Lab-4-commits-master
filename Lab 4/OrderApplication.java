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

		Scanner input = new Scanner(System.in); 

		int size;
		boolean test = true;
		int rItem;

		ArrayList<Product> userChoice = new ArrayList<Product>();
		List quantity = new ArrayList();
		ArrayList<Product> p = new ArrayList<Product>();
		
		PersonalCustomer pCust = new PersonalCustomer(63937373, "Lucio", "Tresendar Manor, Phandalin, Veil", 5000); 

		//CorporateCustomer pCorp = new CorporateCustomer("A-Salt_Squad", "Lucio", "Tresendar Manor, Phandalin, Veil");  
		
		Order a = new Order(pCust); //to test corp customer uncomment above line of code and replace pCust here with pCorp

		do {

			System.out.println("What items would you like to add to your cart (indicate 1 for 1st item etc): ");

			p.add(UI.item.get(input.nextInt()));

			System.out.println("How many of those items: ");

			quantity.add(input.nextInt());

			System.out.println("Add more? (True/False):  ");

			test = input.nextBoolean();

		} while(test == true);


		System.out.println("Your order is: ");
		for (int i = 0; i < p.size(); i++) {
			System.out.print(p.get(i).getName()); 
			System.out.println(" Quantity: "+ quantity.get(i)); 
		}

		System.out.println("Do you want to remove an item entirely (True/False): ");
		test = input.nextBoolean();

		while (test == true) {
			System.out.println("Item (indicate 1 for 1st item etc): ");

			rItem = input.nextInt();

			p.remove(rItem);
			quantity.remove(rItem);

			System.out.println("Your order is: ");
			for (int i = 0; i < p.size(); i++) {
				System.out.print(p.get(i).getName()); 
				System.out.println(" Quantity: "+ quantity.get(i)); 
			}

			System.out.println("Remove more? (True/False):  ");

			test = input.nextBoolean();
		}

		System.out.println("Your order is: ");
		for (int i = 0; i < p.size(); i++) {
			System.out.print(p.get(i).getName()); 
			System.out.println(" Quantity: "+ quantity.get(i)); 
		}

		System.out.println("Do you want to modify a quantity (True/False): ");
		test = input.nextBoolean();

		while (test == true) {
			System.out.println("Item (indicate 1 for 1st item etc): ");

			rItem = input.nextInt();

			System.out.println("New quantity: ");

			quantity.set(rItem, input.nextInt());

			System.out.println("Your order is: ");
			for (int i = 0; i < p.size(); i++) {
				System.out.print(p.get(i).getName()); 
				System.out.println(" Quantity: "+ quantity.get(i)); 
			}

			System.out.println("Modify more? (True/False):  ");

			test = input.nextBoolean();
		}

		System.out.println("Your final order is: ");
		for (int i = 0; i < p.size(); i++) {
			System.out.print(p.get(i).getName()); 
			System.out.println(" Quantity: "+ quantity.get(i)); 

			rItem = (int) quantity.get(i);
			a.addOrderLine(p.get(i), rItem);
		}

		System.out.println("Creating Order...");

		boolean t;
		t = UI.createOrder(a);
	}
	
}


