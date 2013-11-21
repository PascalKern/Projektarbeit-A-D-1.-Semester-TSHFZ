package ch.packzeugs.semproject.presentation;

/**
 * The class ConsoleClientApp demonstrates how to use the class customer
 * and its objects.
 */
public class ConsoleClientApp {

	//Members
	/** The customers data to demonstrate. */
	static String[][] customers = {{"Rahel","Stauffiger"},{"Mister","Complicated"},{"Foo","Bar"}};
	private static int totCustom = 0;
	
	/**
	 * The main method of the ConsoleClientApp
	 *
	 * @param args the arguments, in this state no arguments where used.
	 */
	public static void main(String[] args) {
	    	
		ConsoleClient console = new ConsoleClient();
		
		//"Enter" and save the customers data to the inMemory Data-Mock
		for (int i = 0; i < customers.length; i++) {
				console.createCustomer(customers[i][0], customers[i][1]);
				totCustom++;
		}
		
		//Display the saved customers saved in the inMemory Data-Mock
		String[] data = new String[2];
		int actCustom = 0;
		while (totCustom > actCustom) {
			data = console.displayCustomer(actCustom);
			
			System.out.printf("Customer: %-10s %-15s has entry-ID: %d of total %d entrys\n", data[0], data[1], actCustom, totCustom);
			
			actCustom++;

		}
		
	}

}
