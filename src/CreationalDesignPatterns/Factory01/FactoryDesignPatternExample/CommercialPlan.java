package CreationalDesignPatterns.Factory01.FactoryDesignPatternExample;

public class CommercialPlan extends Plan {
    @Override
    public double getRate() {
        rate = 4;
        System.out.println("rate updated to " + this.rate);

        return rate;
    }
}
