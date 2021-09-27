package coffeeMachine;

public enum MachineInfo {
    DELONGHI("DELONGHI", 1000, 150, "German"),
    SAECO("SAECO", 2000, 450, "Japan"),
    PHILIPS("Philips", 3000, 275, "Holland");

    private String brand;
    private int maxWater;
    private int maxCoffee;
    private String manufacturer;


    MachineInfo(String brand, int maxWater, int maxCoffee, String manufacturer) {
        this.brand = brand;
        this.maxWater = maxWater;
        this.maxCoffee = maxCoffee;
        this.manufacturer = manufacturer;
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxWater() {
        return maxWater;
    }

    public int getMaxCoffee() {
        return maxCoffee;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
