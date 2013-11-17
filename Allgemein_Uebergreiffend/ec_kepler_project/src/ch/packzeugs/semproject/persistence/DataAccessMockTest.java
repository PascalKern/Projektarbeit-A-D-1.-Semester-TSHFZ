/**
 * TODO Class description
 * 
 * @name
 * @version
 * @author
 */
package ch.packzeugs.semproject.persistence;

// TODO: Auto-generated Javadoc
/**
 * The Class DataAccessMockTest.
 *
 * @author PKern
 */
public class DataAccessMockTest {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataAccessMock testMock = new DataAccessMock();
		
		testMock.savePerson("Pascal", "Kern");
		testMock.savePerson("Thomas", "Kern");
		testMock.savePerson("Rahel", "Stauffiger");
		
		System.out.println("*** Get single Client Back --->");

		//Unschön das der speicher Index als ID für die Person verwendet wird
		//=> ID 1 ist demzufolge der Kunde 2 da die ID bei 0 beginnt!
		String[] client = testMock.readPerson(1);
		System.out.println(client[0] + " - " + client[1]);
		client = testMock.readPerson(2);
		System.out.println(client[0] + " - " + client[1]);
		
		System.out.println("*** Read all Clients in Mock --->");
		
		String[][] clients = testMock.readPersons();
		int count = 0;
		while(clients[count] != null){
			client = clients[count];
			System.out.printf("Client Nr: %d is: %-12s%-12s\n", count, client[0], client[1]);
			count += 1;
		}	
		
	}

}
