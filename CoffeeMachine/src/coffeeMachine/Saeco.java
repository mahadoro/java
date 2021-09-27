package coffeeMachine;

public class Saeco extends AbstractCoffeeMachine {

    public Saeco() {
        super(MachineInfo.SAECO.getBrand(), MachineInfo.SAECO.getMaxWater(), MachineInfo.SAECO.getMaxCoffee(), MachineInfo.SAECO.getManufacturer());
    }

}
