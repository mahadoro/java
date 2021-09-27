package coffeeMachine;

public class Philips extends AbstractCoffeeMachine {

    public Philips() {
        super(MachineInfo.PHILIPS.getBrand(), MachineInfo.PHILIPS.getMaxWater(), MachineInfo.PHILIPS.getMaxCoffee(), MachineInfo.PHILIPS.getManufacturer());
    }

}
