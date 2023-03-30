package LearnPath.OOP.Class;

/* 
    In Java, a field is a variable that is declared within a class. 
    Fields are used to represent data or state that is associated with an object of the class.

    Fields can be of any primitive data type (such as int, double, boolean, etc.) or a reference type (such as String, Object, etc.). 
    Fields can also be final or static.
*/

public class Fields {
    private String name;
    private int age;
    private static int count;

    public Fields(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getCount() {
        return count;
    }

}
