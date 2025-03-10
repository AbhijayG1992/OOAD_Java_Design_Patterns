package CreationalDesignPatterns.Factory01.FactoryDesignPatternExample;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Create Factory

        PlanFactory planFactory = new PlanFactory();


        //take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of plan for which the bill will be generated");
        String planName = sc.nextLine();

        System.out.println("Enter the number of units for bill will be calculated");
        int units = sc.nextInt();

        Plan plan = planFactory.getPlan(planName);

        System.out.println("PlanName is : " );
        System.out.println(planName);

        System.out.println("Rate is : " );
        plan.getRate();
        System.out.println(plan.getRate());

        System.out.println("Total Bill is: ");
        plan.calculateBill(units);


    }
}
