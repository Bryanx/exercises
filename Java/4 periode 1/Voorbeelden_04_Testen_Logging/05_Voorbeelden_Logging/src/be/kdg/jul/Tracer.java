package be.kdg.jul;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Tracer {
//	properties?

	private static Logger logger = Logger.getLogger("be.kdg.jul.Tracer");
	public static void main(String[] args) {
		logger.log(Level.FINE,"Filtered.");
	}
}
