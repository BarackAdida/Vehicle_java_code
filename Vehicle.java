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

public interface Automobile {
    int Max_speed = 200;
    string Fuel_type = "Petrol";

    void turnLeft();
    void turnRight();
    void reverse();
}

public class Motocycle extends Vehicle {
    private boolean hasAnotherCar;

    public Motocycle(String brand, String model, int year, boolean hasAnotherCar) {
        super(brand, mode, year);
        this.hasAnotherCar = hasAnotherCar;

        @override
        public void accelerate() {
            if (fuelLevel > 0) {
                speed += 5;
                fuelLevel -= 1;
                System.out.println("Motocyle accelerating; speed: " + speed + "km/h")
            } else {
                System.out.println("Out of fuel! cannot accelrate.")
            }
        }

        @override
        public void stop() {
            speed = 0;
            System.out.println("Motocycle Stopped.")
        }
    }
}

public class Bus extends Vehicle {
    private int passengerCapacity;
    private int currentPassengers;

    public bus(String brand, String model, int year int passengerCapacity) {
        super(brand, model, year);
        this.passengerCapacity = passengerCapacity;
        this.currentPassengers = 0;
    }
     @override
        public void accelerate() {
            if (fuelLevel > 0) {
                speed += 10;
                fuelLevel -= 2;
                System.out.println("Bus accelerating, speed: " + speed + "km/h")
            } else {
                System.out.println("Out of fuel! cannot accelrate.")
            }
        }

        @override
        public void stop() {
            speed = 0;
            System.out.println("Bus Stopped.")
        }

       public void loadPassengers(int count) {
        if (currentPassengers + count <= passengerCapacity) {
            currentPassengers += count;
            System.out.println(count + " passengers loaded. Total: " + currentPassengers);
        } else {
            System.out.println("Cannot load " + count + " passengers. Capacity exceeded!");
        }
       }

    }

public class Sedan extends Vehicle implements Automobile {
    private int trunkCapacity;
    private String color;

    public Sedan(String brand, String model, int year, int trunkCapacity, String color) {
        super(brand, model, year);
        this.trunkCapacity = trunkCapacity;
        this.color = color;
    }

    @override
    public void turnLeft() {
        System.out.println("Sedan turning left with a left turn signal")
    }

    @override
    public void turnRight() {
        System.out.println("Sedan turning right with a right turn signal")
    }
    
    @override
    public void reverse() {
        System.out.println("Sedan is reversing")
    }

    public void displaySedanInfo() {
        displayInfo();
        System.out.println("Trunk capacity: " + trunkCapacity + "liters");
        System.out.println("Color: " + color);
        System.out.println("Max speed: " + Automobile.Max_speed + km/h);
    }
}

class SportsCar extends Vehicle implements Automobile() {
    private int horsepower;
    private int convertible;

    public SportsCar(String model, int horsepower, boolean convertible, int speed) {
        super(model)
        this.horsepower = horsepower;
        this.convertible = convertible;
    }
    @override
    public void SportsCarBrand() {
        if (horsepower = 670 || model = Chevrolet Z06) {
            System.out.println("The sports car is convertible")   
        } else {
            System.out.println("The sports car might not be convertible")
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Sedan mySedan = new Sedan("Toyota", "Camry", 2023, 500, "Silver");

        mySedan.displaySedanInfo()

        mySedan.accelerate();
        System.out.println("Current speed: " + mySedan.getSpeed() + " km/h");
        System.out.println("Fuel level: " + mySedan.getFuelLevel() + "%\n");

        
        Vehicle vehicle1 = new Sedan("Honda", "Accord", 2023, 480, "Black");
        Vehicle vehicle2 = new Motorcycle("Harley-Davidson", "Street 750", 2023, false);

        vehicle1.accelerate();
        vehicle2.accelerate();
        
        mySedan.turnLeft();
        mySedan.turnRight();
        mySedan.reverse();

    }
}