package LearnPath.OOP.Class;

import LearnPath.OOP.Class.exmaple.Person;

/*
 * In Java, a constructor is a special method that is used to initialize an object of a class. 
 * When a new object is created using the new keyword, 
 * the constructor is called to initialize the object's state. 
 * A constructor has the same name as the class and has no return type. 
 * It can take zero or more parameters, which are used to initialize the object's state. 
 * If a constructor takes no parameters, it is called a default constructor.
 */

public class Constructors {

    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 30);
        System.out.println(p1.getName());
        System.out.println(p2.getAge());
    }
}
