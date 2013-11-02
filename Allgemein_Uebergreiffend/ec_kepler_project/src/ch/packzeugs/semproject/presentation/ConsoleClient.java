/**
 * TODO Class description
 * 
 * @name	ConsoleClient.java
 * @version	0.1
 * @author	PKern and …
 */
package ch.packzeugs.semproject.presentation;

import ch.packzeugs.semproject.business.Client;
import ch.packzeugs.semproject.persistence.DataAccessMock;

/**
 * @author PKern
 *
 */
public class ConsoleClient {

	
	public void createCustomer(String name, String surname){
		
		Client client = new Client(name, surname);
		
		
	}
	
	
}
