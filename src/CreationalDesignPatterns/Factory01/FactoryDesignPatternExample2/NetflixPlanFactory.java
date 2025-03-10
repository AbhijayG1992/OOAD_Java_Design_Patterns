package CreationalDesignPatterns.Factory01.FactoryDesignPatternExample2;

public class NetflixPlanFactory {

    public NetflixPlan getPlan(String planType) {
        if(planType == null) {
            return null;
        }
        if(planType.equalsIgnoreCase("BASIC")) {
            return new Basic();
        } else if(planType.equalsIgnoreCase("STANDARD")) {
            return new Standard();
        } else if(planType.equalsIgnoreCase("PREMIUM")) {
            return new Premium();
        }
        return null;
    }
}
