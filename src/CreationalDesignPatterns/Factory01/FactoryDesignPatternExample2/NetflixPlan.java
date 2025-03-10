package CreationalDesignPatterns.Factory01.FactoryDesignPatternExample2;

public abstract class NetflixPlan {
    protected int price;

    abstract  int getPrice();

    public int getFinalAmount(int months) {
        return months * getPrice();
    }

}
