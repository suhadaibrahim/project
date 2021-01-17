package mainbeauty;
import java.util.Scanner;

public class exception {
	
		
		public void selection() {
			Scanner scan= new Scanner(System.in);
			System.out.println("\nEnter 1 to view the details of the products"+"\n Or"+"\nEnter 0 to exit: ");
			int size= scan.nextInt();
			if(size==0) {
				throw new ArithmeticException("YOU SELECTED TO EXIT");
			}
			else {
				System.out.println("YOU ENTERED NUMBER 1 TO SEE THE PRODUCTS");
			}
		}
}