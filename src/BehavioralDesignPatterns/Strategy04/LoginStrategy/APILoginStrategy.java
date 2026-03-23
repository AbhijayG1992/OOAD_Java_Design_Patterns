package BehavioralDesignPatterns.Strategy04.LoginStrategy;

public class APILoginStrategy implements LoginStrategy {
    @Override
    public void login(String username, String password) {
        System.out.println("Sending POST Request to /api/login with credentials...");
        System.out.println("Extracting Auth Token from response...");
        System.out.println("Setting Auth Token in Local Storage.");
    }
}
