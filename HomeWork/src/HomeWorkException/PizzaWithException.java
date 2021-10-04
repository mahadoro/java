package HomeWorkException;

public class PizzaWithException {


    public static void main(String[] args) {
        PizzaWithException pizza = new PizzaWithException();
        try {
            pizza.orderPizza(2131234);
        } catch (WrongNumberException e) {
            System.out.println(e.getMessage());
        }
        pizza.cook();
        try {
            pizza.cookCook();
        } catch (CookBusyException e) {
            System.out.println(e.getMessage());
        }

        pizza.putCheese();
        pizza.putMeet();
        //pizza.putTomatoes();

        try {
            pizza.makePizza();
        } catch (NoSuchIngredientException e) {
            System.out.println(e.getMessage());
        }

    }

    int number = 2131234;

    boolean isCookFree;
    boolean isTomatoes;
    boolean isCheese;
    boolean isMeet;


    public PizzaWithException() {

    }


    public void orderPizza(int pizzeriaNumber) throws WrongNumberException {
        if (number == pizzeriaNumber) {
            System.out.println("Hello! Welcome to our Pizzeria!");
        } else
            throw new WrongNumberException("You have wrong number, friend! Try again!");
    }

    public void cook() {
        System.out.println("Cook is free");
        this.isCookFree = true;
    }

    public void cookCook() throws CookBusyException {
        if (isCookFree) {
            System.out.println("Please make an order!");
        } else
            throw new CookBusyException("Cook is busy, friend, you can wait or call later");
    }

    public void putTomatoes() {
        System.out.println("Put tomatoes");
        this.isTomatoes = true;
    }

    public void putCheese() {
        System.out.println("Put cheese");
        this.isCheese = true;
    }

    public void putMeet() {
        System.out.println("Put Meet");
        this.isMeet = true;
    }

    public void makePizza() throws NoSuchIngredientException {
        System.out.println("Let's look at our menu...");
        if (isTomatoes && isCheese && isMeet)
            System.out.println("We have pizza with these ingredients:)");
        else
            throw new NoSuchIngredientException("Sorry, but we don't have pizza with these ingredients:(");
    }


    public class WrongNumberException extends Exception {
        public WrongNumberException(String message) {
            super(message);
        }
    }

    public class NoSuchIngredientException extends Exception {
        public NoSuchIngredientException(String message) {
            super(message);
        }

    }

    public class CookBusyException extends Exception {
        public CookBusyException(String message) {
            super(message);
        }
    }


}
