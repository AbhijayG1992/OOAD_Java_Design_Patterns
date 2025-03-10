package CreationalDesignPatterns.Builder03.BuilderDesignPatternExample.Builders;


import CreationalDesignPatterns.Builder03.BuilderDesignPatternExample.Product.House;

public interface HouseBuilder {

    public void buildBasement();

    public void buildStructure();

    public void buildRoof();

    public void buildInterior();

    public House getHouse();
}
