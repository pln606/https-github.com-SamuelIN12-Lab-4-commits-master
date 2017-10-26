import java.util.*;


public class OrderApplication {

	public ArrayList item = new ArrayList();

	boolean createOrder(Order a) {

		bool test = importCatalogue();

		if (test == true) {
			System.out.println("Successful Import");
		}

		int cost = a.calculatePrice();
	}
	
	boolean importCatalogue() {
		try {
			Scanner input = new Scanner(Paths.get("ProductCatalogue.txt"));

			//gets rid of the first header line in the txt file
        	input.nextLine();
        	//gets all the employee data from the file
			for (int i = 0; i < 10; i++) {			
				item = new Product;
				item.setPrice(input.nextDouble());
				item.setName(input.next());
				item.setProductID(input.nextInt());
				catalogue.add(item);
			}

			input.close();

        }
        catch(FileNotFoundException ex) {
            System.out.println("ERROR: File Does Not Exist");                
        }
        catch(IOException ex) {
            System.out.println("ERROR: File Cannot be Read");                  

        }
	}
	
}


