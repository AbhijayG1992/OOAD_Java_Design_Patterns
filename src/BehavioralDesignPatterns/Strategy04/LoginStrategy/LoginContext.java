package BehavioralDesignPatterns.Strategy04.LoginStrategy;

public class LoginContext {
    private LoginStrategy strategy;

    public LoginContext(LoginStrategy strategy) {
        this.strategy = strategy;
    }

    public void setLoginStrategy(LoginStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeLogin(String username, String password) {
        this.strategy.login(username, password);
    }
}
