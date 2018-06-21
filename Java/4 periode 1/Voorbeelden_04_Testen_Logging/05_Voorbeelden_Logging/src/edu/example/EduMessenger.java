package edu.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EduMessenger {
	private static Logger logger = Logger.getLogger("edu.example.EduMessenger");

	public void log(String msg){
		logger.log(Level.INFO, msg);
	}
}
