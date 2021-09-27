package coffeeMachine;

public interface CoffeeMachine {

    void makeCoffee(int selectionNumber);
    void show(int waterTank, int coffeeTank);
   void fullWaterTank();
    void fullCoffeeTank();
    void showInformation();

}
