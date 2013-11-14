/**
 * TODO Class description
 * 
 * @name
 * @version
 * @author
 */
package ch.packzeugs.semproject.business;

import ch.packzeugs.semproject.business.person.Person;
import ch.packzeugs.semproject.persistence.DataAccessMock;

/**
 * @author PKern
 *
 */
public class Customer extends Person{

	/**
	 * @param name
	 * @param surname
	 */
	public Customer(String name, String surname) {
		super(name, surname);
		// TODO Auto-generated constructor stub
	}

	
	public void saveCustomer(Customer customer){
		DataAccessMock dataMock = new DataAccessMock();
		String[] customerMap = new String[2];
	
		customerMap[0] = this.getName();	//customer.getName();
		customerMap[1] = this.getSurname();	//customer.getSurname;
		
		dataMock.savePerson(customerMap);
		
	}
	
	
	static public Customer findCustomer(int customerID){
		Customer customer = new Customer();
		
		
		return customer;
	}
	
}
