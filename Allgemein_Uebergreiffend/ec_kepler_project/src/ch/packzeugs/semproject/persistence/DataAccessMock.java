/**
 * @name	${file_name}
 * @version	0.0.1
 * @author	Pascal and David
 */

package ch.packzeugs.semproject.persistence;

/**
 * The Class DataAccessMock represents a data access mock implementation to store
 * data from persons (ie. customer, employees) as in-memory in a array.
 *
 * @author 	Pascal and David
 * @version	0.0.1
 */
public class DataAccessMock {
    
    	//Members
	/** The client list. */
	private String[][] personList = null;
	
	/** The customermax. */
	private final int PESONSMAX = 15;
	
	/** The client count. */
	private int personsCount;
	
	
	/**
	 * Special constructor.
	 */
	public DataAccessMock(){
		personsCount = 0;
		personList = new String[PESONSMAX][];
	}
	
	/**
	 * Save the persons data in the in-memory data storage.
	 *
	 * @param person the data of the person to insert to the in-memory.
	 */
	public void savePerson(String[] person) {
		if(personsCount < PESONSMAX){
			personList[personsCount] = person;
			personsCount++;
		}else{
			System.err.println("The Maximum of persons to save (" + PESONSMAX + ") is reached! Nothing saved!");
		}
	}
	
	/**
	 * Read the data of one person from the in-memory data storage.
	 *
	 * @param entryID the id of the entry from which to return the persons data
	 * @return the data of the read person or in case of an error <i>NULL<i>.
	 */
	public String[] readPerson(int entryID){
		if(entryID < personsCount){
		    return personList[entryID];
		}else{
		    System.err.println("The given entryID was to high! Not found in the memory.");
		    return null;		    
		}
	}
	
	/**
	 * Read the data of all persons from the in-memory data storage.
	 *
	 * @return the string[][] data of all saved persons.
	 */
	public String[][] readPersons(){
		return personList;
	}

	/**
	 * Save data of a person to the in-memory
	 *
	 * @param name the name of the person
	 * @param surname the surname of the person
	 */
	public void savePerson(String name, String surname){
		String[] person = new String[2];
		person[0] = name;
		person[1] = surname;
		
		savePerson(person);
		
	}

}
