/**
 * TODO Class description
 * 
 * @name	DataAccessMock.java
 * @version	0.1
 * @author	PKern and DMarmy
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
	
	
	/**
	 * Special constructor
	 */
	public DataAccessMock(){
		clientCount = 0;
		clientList = new String[CUSTOMERMAX][];
	}
	
	/**
	 * @param client
	 */
	public void savePerson(String[] client) {
		if(clientCount < CUSTOMERMAX){
			clientList[clientCount] = client;
			clientCount += 1;
		}else{
			System.err.println("The Maximum of clients (" + CUSTOMERMAX + ") in the Mock was reached! Nothing saved!");
		}
	}
	
	public String[] readPerson(int clientID){
		if(clientID < clientCount){
			return clientList[clientID];
		}
		return null;
	}
	
	public String[][] readPersons(){
		return clientList;
	}

	public void savePerson(String name, String surname){
		String[] client = new String[2];
		client[0] = name;
		client[1] = surname;
		
		savePerson(client);
		
	}

}
