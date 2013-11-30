/**
 * @name	${file_name}
 * @version	0.0.1
 * @author	Pascal and David
 */

package ch.packzeugs.semproject.business.person;

import ch.packzeugs.semproject.persistence.DataAccessMock;

/**
 * The class Customer delivers the implementation of a customer as a
 * <i>"kind"<i> of a person.
 *  
 * @version	0.0.1
 * @author	Pascal and David
 */
public class Customer extends Person{

	//Members
	/** The data mock instance used as the DAO */
	private static DataAccessMock dataMock = new DataAccessMock();
	
	/** The actually customer counter. */
	private static int customer_count;
	
	
	//Special constructors
	/**
	 * Instantiates a new customer.
	 *
	 * @param name the name of the instantiated customer
	 * @param surname the surname of the instantiated customer
	 */
	public Customer(String name, String surname) {
		super(name, surname);
	}

	/**
	 * Instantiates a new customer.
	 *
	 * @param customerData the data for the new customer in the form of <i><<String name, String surname>><i>
	 */
	//For testing for the readCustomer() method
	public Customer(String[] customerData) {
		this(customerData[0], customerData[1]);
	}


	/**
	 * Save a customer.
	 */
	public void saveCustomer(){
		customer_count++;	
		String[] customerMap = new String[2];

		customerMap[0] = this.getName();	//customer.getName();
		customerMap[1] = this.getSurname();	//customer.getSurname();
		
		dataMock.savePerson(customerMap);
		
	}
	
	
	//TODO Catch the possible wrong ID
	/**
         * Find customer (with its entryID) in the memory.
         *
         * @param customerID the entry id where the customer was saved in the memory
         * @return the customer or <i>NULL<i> if the customer couldn't be found.
         */
        static public Customer findCustomer(int customerID){
		String[] customerData = new String[2];
		
		if(customerID < customer_count){
			customerData = dataMock.readPerson(customerID);	
			Customer customer = new Customer(customerData);
			return customer;
		}else{
			System.err.println("The customer ID you gave is to hight! Nothing found in memory!\n");
			return null;
		}
	}
	
}
