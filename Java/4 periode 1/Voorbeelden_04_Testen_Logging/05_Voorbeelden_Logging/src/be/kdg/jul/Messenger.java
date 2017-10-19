package be.kdg.jul;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Messenger {
// properties: logging.properties (INFO - WARNING)

	private static final Logger logger = Logger.getLogger("be.kdg.jul.Messenger");

	public static void main(String[] args) {

		logger.log(Level.FINE,"A message to you, Rudy.");


	}
}
