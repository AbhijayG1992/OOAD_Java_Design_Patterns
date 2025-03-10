package CreationalDesignPatterns.Singleton02.SingletonDesignPatternExample;

public class Singleton {
    //data member
    private static Singleton instance = null;

    // make constructor private , so that no one can create object of this class
    private Singleton() {

    }

    // static method to create instance of Singleton class
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


    public void sayHello() {
        System.out.println("Hi, I am in Singleton class");
        System.out.println(instance);
    }
}