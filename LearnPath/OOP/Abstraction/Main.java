package LearnPath.OOP.Abstraction;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Area of circle: " + circle.getArea());

        Shape square = new Square(4);
        System.out.println("Area of square: " + square.getArea());
    }
}
