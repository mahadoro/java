package coffeeMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose a Coffee Machine model.");
        System.out.println("1 - DeLonghi \n2 - Saeco \n3 - Philips");
        String input = scan.nextLine();

        if (input.equals("1")) {
            DeLonghi deLonghi = new DeLonghi();
            System.out.println("Tank with water is full - " + deLonghi.getWaterTank() + " milliliters");
            System.out.println("Tank with coffee is full - " + deLonghi.getCoffeeTank() + " grams");
            deLonghi.runMainProg();
        } else if (input.equals("2")) {
            Saeco saeco = new Saeco();
            System.out.println("Tank with water is full - " + saeco.getWaterTank() + " milliliters");
            System.out.println("Tank with coffee is full - " + saeco.getCoffeeTank() + " grams");
            saeco.runMainProg();
        } else if (input.equals("3")) {
            Philips philips = new Philips();
            System.out.println("Tank with water is full - " + philips.getWaterTank() + " milliliters");
            System.out.println("Tank with coffee is full - " + philips.getCoffeeTank() + " grams");
            philips.runMainProg();
        }


    }


}

