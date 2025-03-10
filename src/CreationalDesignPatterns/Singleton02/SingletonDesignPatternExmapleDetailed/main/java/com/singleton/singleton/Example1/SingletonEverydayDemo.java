package CreationalDesignPatterns.Singleton02.SingletonDesignPatternExmapleDetailed.main.java.com.singleton.singleton.Example1;

public class SingletonEverydayDemo {
    public static void main(String args[]){
        Runtime SingletonRuntime = Runtime.getRuntime();
        SingletonRuntime.gc();
        System.out.println(SingletonRuntime);

        Runtime anotherInstance = Runtime.getRuntime();
        System.out.println(anotherInstance);

        if(SingletonRuntime == anotherInstance){
            System.out.println("They are the same instance");
        }
    }
}
