package test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class WeltDerZeichen {

	/**
	 * @param args keine
	 */
	public static void main(String[] args) {
		
		final Logger logger = Logger.getLogger("WeltDerZeichen");
		
		logger.log(Level.INFO,"Definiere und Erzeuge Objekt1");
		String string1 = new String("Wort1");
		
		logger.log(Level.INFO,"Wandle den Longwert 5L");
		string1.valueOf(5L); 
		
		logger.log(Level.INFO,"Erzeuge die Stringpräsentation");
		string1.toString();
		
		logger.log(Level.INFO,"Definition Objekt2");
		String string2 = null;
		
		logger.log(Level.INFO,"Wandle den Longwert 5L");
		string2.valueOf(5L); 
		
		logger.log(Level.INFO,"Erzeuge die Stringpräsentation");
		string2.toString();
		
		logger.log(Level.INFO,"Fertig für heute");

		
		
	}

}
