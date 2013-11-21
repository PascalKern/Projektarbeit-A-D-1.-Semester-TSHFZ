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
	 * @param name the name of the person
	 * @param surname the surname of the person
	 */
	protected Person(String name, String surname){
		this.name = name;
		this.surname = surname;	
	}
	
	
	
	/**
	 * Gets the name of the person.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name of the person.
	 *
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the surname of the person.
	 *
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	
	/**
	 * Sets the surname of the person.
	 *
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
}
