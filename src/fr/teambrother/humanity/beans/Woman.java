/**
 * 
 */
package fr.teambrother.humanity.beans;

/**
 * @author s6raphin
 *
 */
public class Woman extends Human {
	
	private static final Boolean IS_WOMAN = false;

	public Woman(String firstName, String lastName) {
		super(firstName, lastName, IS_WOMAN);
	}

}
