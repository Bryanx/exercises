package be.kdg.jul;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HandlerLevels {
// properties: fileLogging.properties

	private static final Logger logger = Logger.getLogger("be.kdg.jul.HandlerLevels");

	public static void main(String[] args) {
		logger.log(Level.FINER,"A message to you, Rudy.");
		logger.log(Level.FINE,"Message in a bottle.");
		logger.log(Level.INFO,"Kleine boodschap..");
	}
}
