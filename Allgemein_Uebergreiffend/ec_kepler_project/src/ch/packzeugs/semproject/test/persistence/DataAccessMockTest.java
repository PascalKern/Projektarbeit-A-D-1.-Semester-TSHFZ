/**
 * @name	${file_name}
 * @author	Pascal and David
 */

package ch.packzeugs.semproject.test.persistence;

import ch.packzeugs.semproject.persistence.DataAccessMock;

/**
 * The Class DataAccessMockTest is used for testing the DataAccessMock class.
 *
 * @author	Pascal and David
 */
public class DataAccessMockTest {
	
	/**
	 * The main method for the test on class DataAccessMock.
	 *
	 * @param args the arguments - no arguments used
	 */
	public static void main(String[] args) {

		DataAccessMock testMock = new DataAccessMock();
		
		System.out.println("*** Save persons: --->");

		//Create some test data
		testMock.savePerson("Pascal", "Kern");
		testMock.savePerson("Thomas", "Kern");
		testMock.savePerson("Rahel", "Stauffiger");
		
		System.out.println("Saved persons: Pascal Kern, Thomas Kern, Rahel Stauffiger");
		
		
		System.out.println("*** Read single persons from in-memory: --->");

//Development in Comment:
// Unsch&uuml;n das der speicher Index als ID f&uuml;r die Person verwendet wird
// => ID 1 ist demzufolge der Kunde 2 da die ID bei 0 beginnt!
		int personID = 1;
		String[] person = testMock.readPerson(personID);
		System.out.printf("Read person: %-12s %s, from entryID: %d\n",person[0], person[1], personID);
		personID = 2;
		person = testMock.readPerson(2);
		System.out.printf("Read person: %-12s %s, from entryID: %d\n",person[0], person[1], personID);
		
		
		System.out.println("*** Read all persons from in-memory: --->");
		
		String[][] persons = testMock.readPersons();
		personID = 0;
		while(persons[personID] != null){
		    	person = persons[personID];
			System.out.printf("Read person: %-12s %s, from entryID: %d\n",person[0], person[1], personID);
			//System.out.printf("Read person: %-12s %s, from entryID: %d\n",persons[personID][0], persons[personID][1], personID);
			personID++;
		}	
		
	}

}
