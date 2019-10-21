/**
 * 
 */
package business;

import java.util.Scanner;

import javax.mail.internet.NewsAddress;

import model.Person;

/**
 * @author david
 *
 */
public class PersonBusiness {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Person person = new Person();
		Person per = new Person("David", "Aaron");
		
		person.bringPerson("Roy", "Robinson");
		person.getLastName();
		System.out.println(per.getLastName());
		System.out.println(per.toString());
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter username");

	    String userName = myObj.nextLine();  // Read user input
	    System.out.println("Username is: " + userName);  // Output user input

	}

}
