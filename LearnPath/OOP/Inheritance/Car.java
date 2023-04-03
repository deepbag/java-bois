package LearnPath.OOP.Inheritance;

public class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        // In Java, super is a keyword that refers to the superclass of a subclass. It
        // is used to call the constructor, methods, and properties of the superclass
        // from within the subclass.
        super(make, model, year);
        // add new one
        this.numDoors = numDoors;
    }

    public void drive() {
        System.out.println("Driving the car...");
    }
    public void drivestop() {
        System.out.println("Stop the car...");
    }

    public static void main(String[] args) {
        Car myCar = new Car("Honda", "Civic", 2022, 4);
        myCar.start(); // inherited from Vehicle
        myCar.drive(); // specific to Car
        myCar.drivestop(); // specific to Car
        myCar.stop(); // specific to Car
    }
}
