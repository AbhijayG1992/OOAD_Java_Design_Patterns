package BehavioralDesignPatterns.Observer07.TestExecutionObserver;

import java.util.ArrayList;
import java.util.List;

public class TestRunnerSubject {
    private List<TestListener> listeners = new ArrayList<>();

    public void addListener(TestListener listener) {
        listeners.add(listener);
    }

    public void removeListener(TestListener listener) {
        listeners.remove(listener);
    }

    public void runTest(String testName, boolean shouldPass) {
        notifyStart(testName);
        try {
            // Simulate test execution
            System.out.println("Executing test: " + testName + "...");
            if (!shouldPass) {
                throw new RuntimeException("Assertion failed!");
            }
            notifySuccess(testName);
        } catch (Exception e) {
            notifyFailure(testName, e.getMessage());
        }
    }

    private void notifyStart(String testName) {
        for (TestListener lst : listeners) lst.onTestStart(testName);
    }
    private void notifySuccess(String testName) {
        for (TestListener lst : listeners) lst.onTestSuccess(testName);
    }
    private void notifyFailure(String testName, String error) {
        for (TestListener lst : listeners) lst.onTestFailure(testName, error);
    }
}
