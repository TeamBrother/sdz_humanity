/**
 * 
 */
package fr.teambrother.humanity.beans;

/**
 * @author s6raphin
 *
 */
public class Man extends Human {
	
	private static final Boolean IS_MAN = true;

	public Man(String firstName, String lastName) {
		super(firstName, lastName, IS_MAN);
	}

}
