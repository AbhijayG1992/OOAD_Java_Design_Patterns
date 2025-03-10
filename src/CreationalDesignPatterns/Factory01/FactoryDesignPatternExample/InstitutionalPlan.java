package CreationalDesignPatterns.Factory01.FactoryDesignPatternExample;

public class InstitutionalPlan extends Plan{

    @Override
    public double getRate() {
        rate = 5;
        System.out.println("rate updated to " + this.rate);
        return rate;
    }

}
