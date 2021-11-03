package HomeWorkThreads;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MyCoffeeMachine {
    private static int water = 100;
    private static int coffee = 50;
    private static int milk = 40;
    private static boolean IS_BUSY = false;
    private static final int USERS_COUNT = 10;

    public static void main(String[] args) throws InterruptedException {
        int min = 1;
        int max = 3;
        for (int i = 0; i < USERS_COUNT; i ++) {
            Thread user = new Thread(() -> {
                int random = new Random().nextInt(max - min + 1) + min;
                try {
                    System.out.println("requested prepare drink: " + random);
                    Map drink = prepareDrink(random);
                    System.out.println("prepared: " + drink);
                    water = water - (Integer) drink.get("water");
                    coffee = coffee - (Integer) drink.get("coffee");
                    milk = milk - (Integer) drink.get("milk");
                    System.out.println("left: water " + water + "; coffee " + coffee + "; milk " + milk);
                } catch (InterruptedException e) {
                    System.out.println("drink: " + random +" is not prepared. coffee machine is busy");
                }
                System.out.println();
            });
            user.start();
            Thread.sleep(5000);
        }

    }

    private static Map prepareDrink(int random) throws InterruptedException {
        if (IS_BUSY) {
            throw new InterruptedException("coffeeMachine is busy");
        }
        IS_BUSY = true;
        Map drink = null;
        switch (random) {
            case 1: drink = getEspresso(); break;
            case 2: drink = getAmericano(); break;
            case 3: drink = getCappuccino(); break;
        }
        IS_BUSY = false;
        return drink;

    }

    private static Map<String, Integer> getEspresso() throws InterruptedException {
        int prepareTime = 2000;
        Map<String, Integer> espresso = new HashMap<>();
        espresso.put("drinkId", 1);
        espresso.put("water", 1);
        espresso.put("coffee", 3);
        espresso.put("milk", 1);
        Thread.sleep(prepareTime);
        return espresso;
    }

    private static Map<String, Integer> getAmericano() throws InterruptedException {
        int prepareTime = 7000;
        Map<String, Integer> americano = new HashMap<>();
        americano.put("drinkId", 2);
        americano.put("water", 2);
        americano.put("coffee", 3);
        americano.put("milk", 4);
        Thread.sleep(prepareTime);
        return americano;
    }

    private static Map<String, Integer> getCappuccino() throws InterruptedException {
        int prepareTime = 5000;
        Map<String, Integer> cappuccino = new HashMap<>();
        cappuccino.put("drinkId", 3);
        cappuccino.put("water", 2);
        cappuccino.put("coffee", 2);
        cappuccino.put("milk", 4);
        Thread.sleep(prepareTime);
        return cappuccino;
    }
}
