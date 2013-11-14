/**
 * TODO Class description
 * 
 * @name	ConsoleClient.java
 * @version	0.1
 * @author	PKern and …
 */
package ch.packzeugs.semproject.presentation;

import ch.packzeugs.semproject.business.person.Customer;




/**
 * @author PKern
 *
 */
public class ConsoleClient {

	
	public void createCustomer(String name, String surname){
		
		Customer client = new Customer(name, surname);
		client.saveCustomer();
		
	}
	
	//Display already here?
	public String[] displayCustomer(int id){
		String[] customer = new String[2];
		
		Customer custom = Customer.findCustomer(id);
		
		customer[0] = custom.getName();
		customer[1] = custom.getSurname();
		
		return customer;
	}
	
}
