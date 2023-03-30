package LearnPath.Loops;

public class Loops {
    public static void main(String[] args) {
        int forI = 0;
        int forWhile = 0;
        int forDoWhile = 0;

        // FOR LOOP
        for (forI = 0; forI < 5; forI++) {
            System.out.println("For Loop!");
        }
        // WHILE LOOP
        while (forWhile < 5) {
            System.out.println("While Loop!");
            forWhile++;
        }
        // DO WHILE LOOP
        do {
            System.out.println("Do While Loop!");
            forDoWhile++;
        } while (forDoWhile < 5);
    }

}
