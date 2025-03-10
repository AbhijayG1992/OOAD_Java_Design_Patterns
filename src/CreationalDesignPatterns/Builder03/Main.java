package CreationalDesignPatterns.Builder03.BuilderDesignPatternExample;

import CreationalDesignPatterns.Builder03.BuilderDesignPatternExample.Builders.HouseBuilder;
import CreationalDesignPatterns.Builder03.BuilderDesignPatternExample.Builders.IglooHouseBuilder;
import CreationalDesignPatterns.Builder03.BuilderDesignPatternExample.Director.CivilEngineer;
import CreationalDesignPatterns.Builder03.BuilderDesignPatternExample.Product.House;



public class Main {

    public static void main(String[] args) {

        //we want to build HouseType: Igloo
        HouseBuilder iglooBuilder = new IglooHouseBuilder();

        //tell that to our Director i.e. Civil Engineer
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);

        //engineer starts constructing house
        engineer.constructHouse();

        //house creation done, just fetch the housee
        House house = engineer.getHouse();

        //Prints the House
        System.out.println("Builder constructed: "+ house);
    }
}
