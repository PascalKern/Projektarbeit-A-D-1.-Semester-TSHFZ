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
		
		testMock.saveCustomer("Pascal", "Kern");
		testMock.saveCustomer("Thomas", "Kern");
		testMock.saveCustomer("Rahel", "Stauffiger");
		
		System.out.println("*** Get single Client Back --->");

		String[] client = testMock.readCustomer(1);
		System.out.println(client[0] + " - " + client[1]);
		client = testMock.readCustomer(2);
		System.out.println(client[0] + " - " + client[1]);
		
		System.out.println("*** Read all Clients in Mock --->");
		
		String[][] clients = testMock.readCustomers();
		int count = 0;
		while(clients[count] != null){
			client = clients[count];
			System.out.printf("Client Nr: %d is: %-12s%-12s\n", count, client[0], client[1]);
			count += 1;
		}	
		
	}

}
