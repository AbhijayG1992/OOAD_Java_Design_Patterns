package CreationalDesignPatterns.Builder03.BuilderDesignPatternDetailedExample.Example01;

// builder pattern is a creational design pattern that lets you
// construct complex objects step by step
public class BuilderEverydayDemo {

    public static void main(String args[]) {

        // This is an example of the builder pattern
        // It has methods to append almost anything we want to a String
        StringBuilder builder = new StringBuilder();

        builder.append("This is an example ");

        builder.append("of the builder pattern. ");

        builder.append("It has methods to append ");

        builder.append("almost anything we want to a String. ");

        builder.append(42);

        String builderString = builder.toString();

        System.out.println(builderString);
        System.out.println(builder);
    }

}