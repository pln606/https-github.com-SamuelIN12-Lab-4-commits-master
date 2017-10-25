import java.io.*;
import java.util.*;
import java.nio.file.Paths;

public class ProductCatalogue {

	try {
			Scanner input = new Scanner(Paths.get("ProductCatalogue.txt"));
			//100 element employee array
			ArrayList catalogue = new ArrayList();

			Product item = new Product();
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
