package CreationalDesignPatterns.Singleton02.SingletonDesignPatternExample;

public class MainSingleton {
    public static void main(String args[]) {
        Singleton singleton = Singleton.getInstance();
        singleton.sayHello();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.sayHello();
        /*
         Output:

         Hi, I am in Singleton class
         CreationalDesignPatterns.Singleton.SingletonDesignPatternExample.Singleton@5010be6
         Hi, I am in Singleton class
         CreationalDesignPatterns.Singleton.SingletonDesignPatternExample.Singleton@5010be6

         */
    }
}


/*

Creating multiple Objects Possible ?
    No, Singleton class is designed to create only one object. If you try to create multiple objects, it will return the same object.

Can we create multiple objects using Reflection ?
    Yes, we can create multiple objects using Reflection. But, we can avoid this by adding a check in the constructor to throw an exception if the object is already created.

Can we create multiple objects using Serialization ?
    Yes, we can create multiple objects using Serialization. But, we can avoid this by adding a readResolve() method in the Singleton class.

Can we create multiple objects using Cloning ?
    Yes, we can create multiple objects using Cloning. But, we can avoid this by overriding the clone() method and throw an exception if the object is already created.

Can we create multiple objects using Multithreading ?
    Yes, we can create multiple objects using Multithreading. But, we can avoid this by adding synchronized keyword to the getInstance() method.

Race Condition in Multithreading explained -
   Double locking mechanism is used to avoid


Examples of Singleton Pattern

DB
Logging

 */