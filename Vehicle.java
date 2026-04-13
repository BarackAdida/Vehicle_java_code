public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    protected int speed;
    protected int fuelLevel;

    public Vehicle(String brand, int year, String model) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0;
        this.fuelLevel = 100;
    }

    public abstract void acceleration();
    public abstract void stop();
    public abstract void gas();

    public int getSpeed() {
        return speed;
    }
    public int getFuelLevel() {
        return fuelLevel;
    }
}