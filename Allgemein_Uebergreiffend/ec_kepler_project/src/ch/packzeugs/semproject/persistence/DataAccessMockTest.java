/**
 * TODO Class description
 * 
 * @name
 * @version
 * @author
 */
package ch.packzeugs.semproject.persistence;

/**
 * @author PKern
 *
 */
public class DataAccessMockTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataAccessMock testMock = new DataAccessMock();
		
		testMock.savePerson("Pascal", "Kern");
		testMock.savePerson("Thomas", "Kern");
		testMock.savePerson("Rahel", "Stauffiger");
		
		System.out.println("*** Get single Client Back --->");

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
