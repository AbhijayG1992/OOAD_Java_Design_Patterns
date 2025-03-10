package CreationalDesignPatterns.Builder03.BuilderDesignPatternDetailedExample.Example02.Example3;

import CreationalDesignPatterns.Builder03.BuilderDesignPatternDetailedExample.Example02.Example3.ComputerTelescoping;
import CreationalDesignPatterns.Builder03.BuilderDesignPatternDetailedExample.Example02.Example3.HDD;
import CreationalDesignPatterns.Builder03.BuilderDesignPatternDetailedExample.Example02.Example3.RAM;


public class ComputerTelescopingConfigureDemo {

    public static void main(String[] args) {

        ComputerTelescoping computer = new ComputerTelescoping(HDD.DEFAULT, RAM.DEFAULT, true, true);

        System.out.println(computer.getDiskSize());
        System.out.println(computer.getRamSize());
        System.out.println(computer.isHasUsbc());
        System.out.println(computer.isHasGigabitWifi());
    
    }
}
