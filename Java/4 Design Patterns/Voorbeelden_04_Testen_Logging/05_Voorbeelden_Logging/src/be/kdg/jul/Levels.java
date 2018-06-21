package be.kdg.jul;

import edu.example.EduMessenger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Levels {
	// properties: fileLogging.pkg_filter_properties

	private static Logger logger = Logger.getLogger("be.kdg.jul.Levels");
	public static void main(String[] args) {

		logger.log(Level.INFO,"Test be.kdg Level");
		EduMessenger eduMsg = new EduMessenger();
		eduMsg.log("Test edu.example Level");
	}
}
