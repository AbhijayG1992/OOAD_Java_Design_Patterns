package CreationalDesignPatterns.Factory01.FactoryDesignPatternExample2;

public class FactoryPatternProgramMain {

    public static void main(String args[]){
        // Factory Pattern
        NetflixPlanFactory netflixPlanFactory = new NetflixPlanFactory();

        // Get the object of Basic Plan and call the getPrice method
        NetflixPlan netflixPlan = netflixPlanFactory.getPlan("BASIC");
        System.out.println("Basic Plan: " + netflixPlan.getFinalAmount(3));

        // Get the object of Standard Plan and call the getPrice method
        netflixPlan = netflixPlanFactory.getPlan("STANDARD");
        System.out.println("Standard Plan: " + netflixPlan.getFinalAmount(3));

        // Get the object of Premium Plan and call the getPrice method
        netflixPlan = netflixPlanFactory.getPlan("PREMIUM");
        System.out.println("Premium Plan: " + netflixPlan.getFinalAmount(3));
    }
}
