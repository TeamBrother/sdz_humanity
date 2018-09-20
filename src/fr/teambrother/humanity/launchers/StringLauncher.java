/**
 * 
 */
package fr.teambrother.humanity.launchers;

/**
 * Launcher pour s'entrainer sur les cha�nes de caract�res.
 * @author chinjto
 *
 */
public class StringLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] data = {'b', 'o', 'n', 'j', 'o', 'u', 'r'};
	    String str = new String(data);
	    System.out.println(str);
	    
	    String str2 = "bonjour";
	    System.out.println(str2);
	    
	    System.out.println(str.equals(str2));
	    
	    boolean isEquals = str.equals(str2);
	    if (isEquals) {
	    	System.out.println("M�mes valeurs");
	    } else {
	    	System.out.println("C'est diff�rent...");
	    }
	    
	    boolean isEquals2 = str == str2;
	    if (isEquals2) {
	    	System.out.println("M�mes valeurs");
	    } else {
	    	System.out.println("C'est diff�rent...");
	    }
	    
	}

}
