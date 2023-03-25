package Age; // parent folder

public class AgeCalculator {
    // initialize int variables
    private int birthYear;
    // object to get year int
    public AgeCalculator(int birthYear) {
        this.birthYear = birthYear;
    }
    // object to calculate year
    public int getAge() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - birthYear;
    }
}
