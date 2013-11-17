/**
 * TODO Class description
 * 
 * @name	ConsoleClient.java
 * @version	0.1
 * @author	PKern and …
 */
package ch.packzeugs.semproject.presentation;

import ch.packzeugs.semproject.business.person.Customer;




// TODO: Auto-generated Javadoc
/**
 * The Class ConsoleClient.
 *
 * @author PKern
 */
public class ConsoleClient {

	
	/**
	 * Creates the customer.
	 *
	 * @param name the name
	 * @param surname the surname
	 */
	public void createCustomer(String name, String surname){
		
		Customer client = new Customer(name, surname);
		client.saveCustomer();
		
	}
	
	//Display already here?
	/**
	 * Display customer.
	 *
	 * @param id the id
	 * @return the string[]
	 */
	public String[] displayCustomer(int id){
		String[] customer = new String[2];
		
		Customer custom = Customer.findCustomer(id);
		
		customer[0] = custom.getName();
		customer[1] = custom.getSurname();
		
		//Variete :-)
		System.out.println(customer[0] + " - " + customer[1]);
		System.out.println(custom.getName() + " - " + custom.getSurname());
		return customer;
	}
	
}
