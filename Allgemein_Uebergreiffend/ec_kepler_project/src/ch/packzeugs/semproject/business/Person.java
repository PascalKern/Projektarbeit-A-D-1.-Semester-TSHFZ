/**
 * TODO Class description
 * 
 * @name
 * @version
 * @author
 */
package ch.packzeugs.semproject.business;

/**
 * @author PKern
 *
 */
public class Person {

	private String name;
	private String surname;
	
	Person(String name, String surname){
		this.name = name;
		this.surname = name;	
	}
	
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
}
