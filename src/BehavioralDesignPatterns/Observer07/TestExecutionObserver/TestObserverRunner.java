package BehavioralDesignPatterns.Observer07.TestExecutionObserver;

public class TestObserverRunner {
    public static void main(String[] args) {
        TestRunnerSubject runner = new TestRunnerSubject();
        
        runner.addListener(new ConsoleLoggerListener());
        runner.addListener(new ExtentReportListener());
        
        runner.runTest("LoginWithValidCredentials", true);
        System.out.println("\n----------------------------------\n");
        runner.runTest("CheckoutWithInvalidCard", false);
    }
}
