package testen;

import junit.framework.TestResult;
import junit.framework.TestSuite;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class WinkelWagentjeTestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(WinkelWagentjeTestSuite.class);

        System.out.println("Failures: " + result.getFailureCount());
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Successful: " + result.wasSuccessful());
        System.out.println("Aantal testcases: " + result.getRunCount());
        System.out.println("Tijd: " + result.getRunTime() + " millisec");
    }
}
