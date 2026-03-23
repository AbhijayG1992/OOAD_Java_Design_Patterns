package BehavioralDesignPatterns.Observer07.TestExecutionObserver;

public interface TestListener {
    void onTestStart(String testName);
    void onTestSuccess(String testName);
    void onTestFailure(String testName, String errorMsg);
}
