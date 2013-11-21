/*
 * TODO File description
 * 
 * @name	ConsoleClient.java
 * @version	0.1
 * @author	PKern and DMarmy
 */
package ch.packzeugs.semproject.presentation;

import ch.packzeugs.semproject.business.person.Customer;



/**
 * The Class ConsoleClient implements the console client of the ConsoleClientApp 
 * example application.
 *
 * @author PKern
 */
public class ConsoleClient {

	
	/**
	 * Creates a new customer
	 *
	 * @param name the name of the customer to create
	 * @param surname the surname of the customer to create
	 */
	public void createCustomer(String name, String surname){
		
		Customer client = new Customer(name, surname);
		client.saveCustomer();
		
	}
	
	/**
	 * Displays a customer.
	 *
	 * @param id the id of the customer to display. This id must not re-
	 * present the customer id. It represents the entry where the 
	 * customer was saved.
	 * @return the string[] customer data extracted from the memory.
	 */
	public String[] displayCustomer(int id){
		String[] customer = new String[2];
		
		Customer custom = Customer.findCustomer(id);
		
		customer[0] = custom.getName();
		customer[1] = custom.getSurname();
		
		/*Variants to test while development*/
		//System.out.println(customer[0] + " - " + customer[1]);
		//System.out.println(custom.getName() + " - " + custom.getSurname());
		
		return customer;
	}
	
}
