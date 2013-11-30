/**
 * @name	${file_name}
 * @version	0.0.1
 * @author	Pascal and David
 */

package ch.packzeugs.semproject.business.person;

/**
 * The Class Person acts as a abstract definition for the properties of
 * a person (aka. customer, employee).
 *
 * @version	0.0.1
 * @author	Pascal and David
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
