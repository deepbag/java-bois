package LearnPath.OOP.Abstraction;

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    // implementation of the abstract method from the base class
    public double getArea() {
        return side * side;
    }
}
