package BehavioralDesignPatterns.Strategy04.LoginStrategy;

public class UILoginStrategy implements LoginStrategy {
    @Override
    public void login(String username, String password) {
        System.out.println("Navigating to Login Page...");
        System.out.println("Entering username: " + username);
        System.out.println("Entering password: " + password);
        System.out.println("Clicking Login Button.");
    }
}
