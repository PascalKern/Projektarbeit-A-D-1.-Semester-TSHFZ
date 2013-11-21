/**
 * TODO Class description
 * 
 * @name
 * @version
 * @author	PKern and DMarmy
 */
package ch.packzeugs.semproject.test.business;

import ch.packzeugs.semproject.business.person.Customer;

// TODO: Auto-generated Javadoc
/**
 * The Class CustomerTest.
 *
 * @author pascal
 */
public class CustomerTest {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("*** Save customer single: --->");

		//Erstelle Customer mit String
		Customer custom = new Customer("Pascal","Kern");
		custom.saveCustomer();
		
		System.out.println("Saved Pascal Kern");
		
		
		
		System.out.println("*** Save customers in array: --->");
		
		//Erstelle Customer mit Array
		String[] customArr = {"David","Marmy"};
		Customer custom2 = new Customer(customArr);
		custom2.saveCustomer();
		System.out.printf("Saved %s %s\n",customArr[0], customArr[1]);
		
		
		
		System.out.println("*** find persons with id: --->");
		
		//Hole Customer mit entryID
		Customer custom3 = Customer.findCustomer(1);
		System.out.printf("Found Customer (ID=1): %10s, %s\n", custom3.getName(), custom3.getSurname());
		
		Customer custom4 = Customer.findCustomer(0);
		System.out.printf("Found Customer (ID=0): %10s, %s\n", custom4.getName(), custom4.getSurname());
		
		
		/*Force error to fix (with exception handling) in next iteration!*/
//		Customer custom5 = Customer.findCustomer(2);
//		System.out.printf("Found Customer (ID=2): %s, %s\n", custom5.getName(), custom5.getSurname());

		
	}

}
