/**
 * TODO Class description
 * 
 * @name
 * @version
 * @author
 */
package ch.packzeugs.semproject.business.person;

import ch.packzeugs.semproject.persistence.DataAccessMock;

/**
 * @author PKern
 *
 */
public class Customer extends Person{

	//Members
	private static DataAccessMock dataMock = new DataAccessMock();
	private static int customer_count;
	
	//Special constructor
	/**
	 * @param name
	 * @param surname
	 */
	public Customer(String name, String surname) {
		super(name, surname);
	}


	/**
	 * @param customerData
	 */
	//Only test for the readCustomer() methode
	public Customer(String[] customerData) {
		//this.Customer(customerData[0], customerData[1]); //Error because this tries to act on the object not the class itself!
		this(customerData[0], customerData[1]);
	}


	public void saveCustomer(){
		customer_count++;	
		String[] customerMap = new String[2];
											//Use for a static Method to save Customer
		customerMap[0] = this.getName();	//customer.getName();
		customerMap[1] = this.getSurname();	//customer.getSurname;
		
		dataMock.savePerson(customerMap);
		
	}
	

//	//Overloaded Method for use with a separate customer object - never needed!
//	public static void saveCustomer(Customer customer){
//		String[] customerMap = new String[2];
//											
//		customerMap[0] = customer.getName();
//		customerMap[1] = customer.getSurname();
//		
//		dataMock.savePerson(customerMap);
//		
//	}

	
	static public Customer findCustomer(int customerID){
		String[] customerData = new String[2];
		
		if(customerID < customer_count){
			customerData = dataMock.readPerson(customerID);	
			Customer customer = new Customer(customerData);
			return customer;
		}else{
			System.err.println("The customer ID you gave is to hight!\n");
		}
		return null;
	}
	
}
