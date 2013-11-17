/**
 * TODO Class description
 * 
 * @name
 * @version
 * @author
 */
package ch.packzeugs.semproject.business.person;

// TODO: Auto-generated Javadoc
/**
 * The Class Person.
 *
 * @author PKern
 */
public class Person {

	/** The name. */
	private String name;
	
	/** The surname. */
	private String surname;
	
	/**
	 * Instantiates a new person.
	 *
	 * @param name the name
	 * @param surname the surname
	 */
	protected Person(String name, String surname){
		this.name = name;
		this.surname = surname;	
	}
	
	
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the surname.
	 *
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	
	/**
	 * Sets the surname.
	 *
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
}
