package LearnPath.OOP.Class;

// In Java, it's possible to define classes and interfaces within the scope of another class or interface. These are known as nested classes and nested interfaces. Here's a brief overview of each:

// Nested Classes:
// A nested class is a class that is defined inside another class. There are four types of nested classes in Java:
// Static nested class: A static nested class is a class that is defined as a static member of the outer class. It can be accessed using the outer class name.
// Inner class: An inner class is a non-static nested class that is defined inside another class. It has access to the members of the outer class, and can be instantiated only in the context of an instance of the outer class.
// Local class: A local class is a nested class that is defined within a method or a block of code. It has access to the variables of the enclosing method or block.
// Anonymous class: An anonymous class is a local class that has no name. It is defined and instantiated at the same time.

public class Nested {

    // NESTED CLASS
    public static class NestedClass {
        public void print() {
            System.out.println("Nested Class");
        }
    }

    private int x = 10;

    // INNER CLASS
    public class InnerClass {
        public void print() {
            System.out.println("Nested Class" + x);
        }
    }

    // INTERFACE
    interface InnerInterface {
        void print();
    }

    public static class MyClass implements InnerInterface {
        public void print() {
            System.out.println("Hello from MyClass");
        }
    }

    public static void main(String[] args) {
        NestedClass nesteditem = new NestedClass();
        nesteditem.print();
        Nested nestedMain = new Nested();
        InnerClass inneritem = nestedMain.new InnerClass();
        inneritem.print();
        MyClass myObject = new MyClass();
        myObject.print();
    }
}

/*
 * Nested Class bahave like a own class object we can use same as class we can
 * write method and use it
 * NestedClass nesteditem = new NestedClass();
 */

/*
 * Inner Class - inner class is like method but its class we cant use it
 * directally we need to initialize first main
 * class then we can initilize inner class using main class
 * Nested nestedMain = new Nested();
 * InnerClass inneritem = nestedMain.new InnerClass();
 */

/*
 * interface - we can defined interface methods
 * public static class MyClass implements InnerInterface {
 * public void print() {
 * System.out.println("Hello from MyClass");
 * }
 * }
 * we just transfer methods to new class
 * for creating something using the interface methods
 * and for use we need to initialize orignial class not interface
 * MyClass myObject = new MyClass();
 * myObject.print();
 */