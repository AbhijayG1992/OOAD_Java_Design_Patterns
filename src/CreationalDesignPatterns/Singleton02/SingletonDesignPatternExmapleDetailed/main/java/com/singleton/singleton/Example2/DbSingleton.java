package CreationalDesignPatterns.Singleton02.SingletonDesignPatternExmapleDetailed.main.java.com.singleton.singleton.Example2;

public class DbSingleton {

    private static DbSingleton instance = new DbSingleton();


    private DbSingleton() {
    }

    public static DbSingleton getInstance() {
        return instance;
    }


}
