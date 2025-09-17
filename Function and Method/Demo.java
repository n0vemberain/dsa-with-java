
// File name: Demo.java
public class Demo {
    // Attribute (variable of the class)
    String name;
    int age;

    // Constructor (special method to initialize object)
    public Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Normal method (function inside a class)
    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    // Method with return type
    public int getAgeAfterYears(int years) {
        return age + years;
    }

    // Static method (can be called without creating an object)
    public static void greet() {
        System.out.println("Welcome! This is a static method.");
    }

    // Main method (starting point of the program)
    public static void main(String[] args) {
        // Call static method
        Demo.greet();

        // Create an object using constructor
        Demo person1 = new Demo("Alice", 25);

        // Call normal method
        person1.sayHello();

        // Call method with return value
        int futureAge = person1.getAgeAfterYears(5);
        System.out.println("In 5 years, " + person1.name + " will be " + futureAge + " years old.");
    }
}
