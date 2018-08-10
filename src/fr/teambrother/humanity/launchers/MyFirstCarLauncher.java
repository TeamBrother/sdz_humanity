/**
 * 
 */
package fr.teambrother.humanity.launchers;

import fr.teambrother.humanity.beans.Car;
import fr.teambrother.humanity.beans.Color;
import fr.teambrother.humanity.beans.Human;
import fr.teambrother.humanity.beans.Man;
import fr.teambrother.humanity.beans.Oil;

/**
 * This program is a Java program for simulate a human community.
 * @author s6raphin
 *
 */
public class MyFirstCarLauncher {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Human h = new Man("Eugene", "JUDITH");
		Car c = new Car(Color.PINK, Oil.GASOIL);
		c.setOwner(h);
		System.out.println(c);
	}

}
