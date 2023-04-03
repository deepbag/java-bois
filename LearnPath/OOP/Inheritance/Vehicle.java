package LearnPath.OOP.Inheritance;

public class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        // object
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start() {
        // methods
        System.out.println("Starting the vehicle...");
    }

    public void stop() {
        // methods
        System.out.println("Stopping the vehicle...");
    }
}

