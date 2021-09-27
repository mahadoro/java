package coffeeMachine;

public enum Drink {
    AMERICANO(250, 10),
    ESPRESSO(30, 7),
    DOUBLE_ESPRESSO(60, 14);

    private int water;
    private int coffee;


    Drink(int water, int coffee) {
        this.water = water;
        this.coffee = coffee;

    }

    public int getCoffee() {
        return coffee;
    }

    public int getWater() {
        return water;
    }


}
