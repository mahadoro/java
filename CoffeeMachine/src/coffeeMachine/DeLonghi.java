package coffeeMachine;

public class DeLonghi extends AbstractCoffeeMachine {

    public DeLonghi() {
        super(MachineInfo.DELONGHI.getBrand(), MachineInfo.DELONGHI.getMaxWater(), MachineInfo.DELONGHI.getMaxCoffee(), MachineInfo.DELONGHI.getManufacturer());
    }

}
