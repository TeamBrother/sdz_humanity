/**
 * 
 */
package fr.teambrother.humanity.launchers;

import fr.teambrother.humanity.beans.Human;
import fr.teambrother.humanity.beans.Man;
import fr.teambrother.humanity.beans.Woman;

/**
 * This program is a Java program for simulate a human community.
 * @author s6raphin
 *
 */
public class LifeLauncher {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Human m1 = new Man("Max", "JUDITH");
		Human m2 = new Man("Eugene", "JUDITH");
		Human w1 = new Woman("Lucie", "JUDITH");
		Human w2 = new Woman("Béatrice", "JUDITH");

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(w1);
		System.out.println(w2);
	}

}
