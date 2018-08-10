/**
 * 
 */
package fr.teambrother.humanity.beans;

/**
 * @author s6raphin
 *
 */
public class Human {
	
	private String firstName;
	private String lastName;
	private Boolean isMan;

	public Human(String firstName, String lastName, Boolean isMan) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.isMan = isMan;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString(){
		final String sex = isMan ? "Man" : "Woman";
		return firstName + " " + lastName + ", who's a " + sex ;
	}

}
