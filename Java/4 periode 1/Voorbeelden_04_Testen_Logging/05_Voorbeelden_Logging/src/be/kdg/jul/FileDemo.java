package be.kdg.jul;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(FileDemo.class.getName());
        FileHandler fileHandler = new FileHandler("mylogging.log", true);
        logger.addHandler(fileHandler);
        logger.info("Information");
        logger.warning("Warning");
    }
}
