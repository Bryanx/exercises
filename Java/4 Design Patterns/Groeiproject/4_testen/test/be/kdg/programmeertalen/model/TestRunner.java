package be.kdg.programmeertalen.model;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Bryan de Ridder
 * @version 1.0 11/10/17 16:35
 */
public class TestRunner {
    public static void main(String[] args) {


        Result result = JUnitCore.runClasses(TestSuite.class);

        System.out.println("Failures: " + result.getFailureCount());
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Successful: " + result.wasSuccessful());
        System.out.println("Aantal testcases: " + result.getRunCount());
        System.out.println("Tijd: " + result.getRunTime() + " millisec");
    }
}
