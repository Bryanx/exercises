package edu.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerMethoden {
	private static Logger logger = Logger.getLogger("edu.example.LoggerMethoden");

	public static void main(String[] args) {
		String user = "Carolus Magnus";
		String company = "KDG";
		logger.log(Level.INFO, "1. log info boodschap");
		logger.info("2. Verkorte vorm info boodschap");
		logger.log(Level.INFO,"3. Boodschap en exception", new RuntimeException("Caught "
			+ "Exception"));
		logger.log(Level.INFO, "4. Concatenatie altijd uitgevoerd voor " + user + " van " +
			company);
		logger.log(Level.INFO, "5. String substitute enkel als INFO actief voor {0} " ,
			user);
		logger.log(Level.INFO, "6. Substitute meerdere parameters met array {0} van {1}" ,
			new 	Object []	{user,company});
		logger.info(() -> "7. Lambda concatenatie enkel als INFO acttief voor " + user +
			" " 	+ "van " + company );
		logger.log(Level.INFO,() -> String.format("8. Lambda format enkel als INFO "
				+ "actief " 	+ "voor %s van %s" ,
			user, company));
	}
}
