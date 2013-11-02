/**
 * TODO Class description
 * 
 * @name	DataAccessMock.java
 * @version	0.1
 * @author	PKern and …
 */
package ch.packzeugs.semproject.persistence;

/**
 * @author PKern
 *
 */
public class DataAccessMock {

	private String[][] clientList = null;
	private final int CUSTOMERMAX = 15;
	private int clientCount;
	
	public DataAccessMock(){
		clientCount = 0;
		clientList = new String[CUSTOMERMAX][];
	}
	
	/**
	 * @param client
	 */
	public void saveCustomer(String[] client) {
		if(clientCount < CUSTOMERMAX){
			clientList[clientCount] = client;
			clientCount += 1;
		}else{
			System.err.println("The Maximum of clients (" + CUSTOMERMAX + ") in the Mock was reached! Nothing saved!");
		}
	}
	
	public void saveCustomer(String name, String surname){
		String[] client = new String[2];
		client[0] = name;
		client[1] = surname;
		
		saveCustomer(client);
		
	}
	
	public String[] readCustomer(int clientID){
		if(clientID < clientCount){
			return clientList[clientID];
		}
		return null;
	}
	
	public String[][] readCustomers(){
		return clientList;
	}

}
