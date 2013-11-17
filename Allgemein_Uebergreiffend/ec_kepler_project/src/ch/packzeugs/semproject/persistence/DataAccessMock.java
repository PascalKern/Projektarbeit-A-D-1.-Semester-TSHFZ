/**
 * TODO Class description
 * 
 * @name	DataAccessMock.java
 * @version	0.1
 * @author	PKern and DMarmy
 */
package ch.packzeugs.semproject.persistence;

// TODO: Auto-generated Javadoc
/**
 * The Class DataAccessMock.
 *
 * @author PKern
 */
public class DataAccessMock {

	/** The client list. */
	private String[][] clientList = null;
	
	/** The customermax. */
	private final int CUSTOMERMAX = 15;
	
	/** The client count. */
	private int clientCount;
	
	
	/**
	 * Special constructor.
	 */
	public DataAccessMock(){
		clientCount = 0;
		clientList = new String[CUSTOMERMAX][];
	}
	
	/**
	 * Save person.
	 *
	 * @param client the client
	 */
	public void savePerson(String[] client) {
		if(clientCount < CUSTOMERMAX){
			clientList[clientCount] = client;
			clientCount += 1;
		}else{
			System.err.println("The Maximum of clients (" + CUSTOMERMAX + ") in the Mock was reached! Nothing saved!");
		}
	}
	
	/**
	 * Read person.
	 *
	 * @param clientID the client id
	 * @return the string[]
	 */
	public String[] readPerson(int clientID){
		if(clientID < clientCount){
			return clientList[clientID];
		}
		return null;
	}
	
	/**
	 * Read persons.
	 *
	 * @return the string[][]
	 */
	public String[][] readPersons(){
		return clientList;
	}

	/**
	 * Save person.
	 *
	 * @param name the name
	 * @param surname the surname
	 */
	public void savePerson(String name, String surname){
		String[] client = new String[2];
		client[0] = name;
		client[1] = surname;
		
		savePerson(client);
		
	}

}
