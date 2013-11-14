/**
 * TODO Class description
 * 
 * @name
 * @version
 * @author	PKern and DMarmy
 */
package ch.packzeugs.semproject.presentation;

/**
 * @author skern
 *
 */
public class ConsoleClientTest {

	//Member
	static String[][] customers = {{"Rahel","Stauffiger"},{"Mister","Complicated"}};
	static int custCount = 0;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ConsoleClient console = new ConsoleClient();
		
		for (int i = 0; i < customers.length; i++) {
				console.createCustomer(customers[i][0], customers[i][1]);
				custCount++;
		}
		
		String[] data = new String[2];
		int actCustom = 0;
		while (custCount > actCustom) {
			data = console.displayCustomer(actCustom);
			
			System.out.println(data[0] + " - " + data[1]);
			
			actCustom++;

		}
		
	}

}
