package BehavioralDesignPatterns.Strategy04.LoginStrategy;

public class TestLoginRunner {
    public static void main(String[] args) {
        // Run test with UI Login (e.g. End-to-End smoke test)
        System.out.println("--- E2E Test Execution ---");
        LoginContext context = new LoginContext(new UILoginStrategy());
        context.executeLogin("testuser", "securepass");
        
        // Run test with API Login (e.g. fast setup for testing another feature)
        System.out.println("\n--- Fast Feature Test Execution ---");
        context.setLoginStrategy(new APILoginStrategy());
        context.executeLogin("testuser", "securepass");
    }
}
