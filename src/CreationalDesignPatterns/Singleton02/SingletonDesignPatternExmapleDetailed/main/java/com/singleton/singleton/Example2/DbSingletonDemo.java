package CreationalDesignPatterns.Singleton02.SingletonDesignPatternExmapleDetailed.main.java.com.singleton.singleton.Example2;

public class DbSingletonDemo {

    public static void main (String [] args) {
        DbSingleton instance = DbSingleton.getInstance();

        System.out.println(instance);

        DbSingleton anotherInstance = DbSingleton.getInstance();

        System.out.println(anotherInstance);

        //DbSingleton test = new DbSingleton(); this is not allowed as constructor is private

        if(instance == anotherInstance) {
            System.out.println("They are the same instance");
        }
    }
}
