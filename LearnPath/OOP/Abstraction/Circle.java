package LearnPath.OOP.Abstraction;

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // implementation of the abstract method from the base class
    public double getArea() {
        return Math.PI * radius * radius;
    }
}