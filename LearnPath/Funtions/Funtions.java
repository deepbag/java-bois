package LearnPath.Funtions;

public class Funtions {
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }

    public static void main(String[] args) {
        double area = calculateArea(5.0, 3.0);
        System.out.println("The area of the rectangle is " + area);

    }

}
