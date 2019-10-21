/**
 * 
 */
package model;

/**
 * @author david
 *
 */
public class Person {
	
	private String  name;
	private String lastName;
	
	public Person(String pName, String pLastName) {
		this.name=pName;
		this.lastName=pLastName;

	}
	
	public Person() {
		

	}
	
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public void bringPerson(String name, String lastName) {
		System.out.println("Hello my name is:  " + name + ",  And LastName is:  " + lastName);
		
	}
		
	
}
	
