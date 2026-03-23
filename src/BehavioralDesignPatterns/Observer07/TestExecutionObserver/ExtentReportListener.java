package BehavioralDesignPatterns.Observer07.TestExecutionObserver;

public class ExtentReportListener implements TestListener {
    @Override
    public void onTestStart(String testName) {
        System.out.println("[ExtentReport] Creating node for test: " + testName);
    }
    @Override
    public void onTestSuccess(String testName) {
        System.out.println("[ExtentReport] Marking test " + testName + " as PASS in Extent Report.");
    }
    @Override
    public void onTestFailure(String testName, String errorMsg) {
        System.out.println("[ExtentReport] Marking test " + testName + " as FAIL in Extent Report. Error: " + errorMsg);
    }
}
