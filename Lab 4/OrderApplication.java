import java.util.*;


public class OrderApplication {

	Product item = new Product();

	boolean createOrder(Order a) {

		int cost = a.calculatePrice()

	}
	
	boolean importCatalogue() {
		try {
			Scanner input = new Scanner(Paths.get("ProductCatalogue.txt"));

			//gets rid of the first header line in the csv file
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


