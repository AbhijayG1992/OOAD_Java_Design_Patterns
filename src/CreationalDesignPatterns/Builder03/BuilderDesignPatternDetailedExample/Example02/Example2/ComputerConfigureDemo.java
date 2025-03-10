package CreationalDesignPatterns.Builder03.BuilderDesignPatternDetailedExample.Example02.Example2;



public class ComputerConfigureDemo {

    public static void main(String[] args) {
        Computer computer = new Computer();

        //when we comment out the following lines,
        // the output is given as GigabitWifi but no computer will exists without HDD and RAM

        computer.setDiskSize(HDD.DEFAULT);
        computer.setRamSize(RAM.DEFAULT);
        computer.setHasUsbc(true);
        computer.setHasGigabitWifi(true);

        System.out.println(computer.getDiskSize());
        System.out.println(computer.getRamSize());
        System.out.println(computer.isHasUsbc());
        System.out.println(computer.isHasGigabitWifi());
    }
}
