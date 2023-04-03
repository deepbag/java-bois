package LearnPath.OOP.Interfaces;

public class Rectangle implements Interface {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(200, 400);
        double count = rectangle.getArea();
        System.out.println(count);
    }
}