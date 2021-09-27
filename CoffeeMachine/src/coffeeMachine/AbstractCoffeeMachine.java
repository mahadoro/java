package coffeeMachine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class AbstractCoffeeMachine implements CoffeeMachine {
    private String brand;
    private int waterTank;
    private int coffeeTank;
    private String manufacturer;
    private int maxWater;
    private int maxCoffee;

    private final Map<Integer, Drink> map = new HashMap<>();


    public AbstractCoffeeMachine(String brand, int waterTank, int coffeeTank, String manufacturer) {
        this.brand = brand;
        this.waterTank = waterTank;
        this.coffeeTank = coffeeTank;
        this.manufacturer = manufacturer;
        this.maxWater = waterTank;
        this.maxCoffee = coffeeTank;
        map.put(2, Drink.AMERICANO);
        map.put(3, Drink.ESPRESSO);
        map.put(4, Drink.DOUBLE_ESPRESSO);

    }

    public int getWaterTank() {
        return waterTank;
    }

    public int getCoffeeTank() {
        return coffeeTank;
    }


    @Override
    public void makeCoffee(int selectionNumber) {
        Drink drink = map.get(selectionNumber);
        System.out.println("For chosen drink we need " + drink.getWater() + " milliliters of water and " + drink.getCoffee() + " grams of coffee.");
        if (waterTank - drink.getWater() >= 0 && coffeeTank - drink.getCoffee() >= 0) {
            waterTank = waterTank - drink.getWater();
            coffeeTank = coffeeTank - drink.getCoffee();
            System.out.println("Coffee is ready!");
        } else if (waterTank - drink.getWater() < 0 && coffeeTank - drink.getCoffee() < 0)
            System.out.println("Not enough water. Current " + waterTank + ". Need " + drink.getWater() + "." +
                    "\n Not enough coffee. Current " + coffeeTank + ". Need " + drink.getCoffee() + ".");
        else if (waterTank - drink.getWater() < 0)
            System.out.println("Not enough water. Current " + waterTank + ". Need " + drink.getWater() + ". Fill the water tank!");
        else if (coffeeTank - drink.getCoffee() < 0)
            System.out.println("Not enough coffee. Current " + coffeeTank + ". Need " + drink.getCoffee() + ". Fill the coffee tank!");
    }

    @Override
    public void show(int waterTank, int coffeeTank) {
        System.out.println("Current amount of water - " + waterTank + " milliliters." + "\nCurrent amount of coffee - " + coffeeTank + " grams.");
    }


    @Override
    public void fullWaterTank() {
        if (waterTank < maxWater) {
            waterTank = maxWater;
            System.out.println("The water tank was refilled");
        } else
            System.out.println("The water tank is full. No need to refile the tank");

    }

    @Override
    public void fullCoffeeTank() {
        if (coffeeTank < maxCoffee) {
            coffeeTank = maxCoffee;
            System.out.println("The coffee tank was refilled");
        } else
            System.out.println("The coffee tank is full. No need to refile the tank");

    }

    @Override
    public void showInformation() {
        System.out.println("The brand is " + brand + ". \nManufacturer is " + manufacturer + ". \n Maximum amount of water is " + maxWater + ". \nMaximum amount of coffee is " + maxCoffee + ".");


    }

    public void runMainProg() {
        Scanner scan = new Scanner(System.in);
        int selection = 0;
        do {
            System.out.println("\nMENU");
            System.out.println("Select 1-8");
            System.out.println("1 - Show the current volume of water and coffee " +
                    "\n2 - Make Americano " +
                    "\n3 - Make Espresso " +
                    "\n4 - Make Double Espresso " +
                    "\n5 - Fill the tank with water" +
                    "\n6 - Fill the coffee tank " +
                    "\n7 - Information " +
                    "\n8 - Turn off the coffee machine");

            selection = scan.nextInt();


            switch (selection) {
                case 1:
                    System.out.println("Show the current amount of water and coffee:");
                    show(waterTank, coffeeTank);

                    break;
                case 2:
                    System.out.println("Make Americano:");
                    makeCoffee(selection);

                    break;
                case 3:
                    System.out.println("Make Espresso:");
                    makeCoffee(selection);

                    break;
                case 4:
                    System.out.println("Make Double Espresso:");
                    makeCoffee(selection);

                    break;
                case 5:
                    System.out.println("Fill the tank with water:");
                    fullWaterTank();

                    break;
                case 6:
                    System.out.println("Fill the coffee tank:");
                    fullCoffeeTank();

                    break;
                case 7:
                    System.out.println("Information:");
                    showInformation();

                    break;
                case 8:
                    System.out.println("Turn off the coffee machine:");

                    break;
                default:
                    System.out.println("Invalid Entry!");
            }

        }
        while (selection != 8);

    }


}
