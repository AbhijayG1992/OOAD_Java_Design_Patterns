package BehavioralDesignPatterns.Observer07.TestExecutionObserver;

public class ConsoleLoggerListener implements TestListener {
    @Override
    public void onTestStart(String testName) {
        System.out.println("[Console] INFO: Test " + testName + " has started.");
    }
    @Override
    public void onTestSuccess(String testName) {
        System.out.println("[Console] SUCCESS: Test " + testName + " completed successfully.");
    }
    @Override
    public void onTestFailure(String testName, String errorMsg) {
        System.err.println("[Console] ERROR: Test " + testName + " failed. Reason: " + errorMsg);
    }
}
