package test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HalloWelt {

	/**
	 * Diese Methode kann durch den Aufruf 
	 * java test.HalloWelt 
	 * auf der Kommandozeile zur Ausf�hrung gebracht werden.
	 *  
	 * @param argumente Kommandozeilen Argumente
	 */
	public static void main(String[] argumente) {
		
		final Logger logger = Logger.getLogger("HalloWelt");
		logger.log(Level.INFO,"Hallo Welt !!!");
	}

}
