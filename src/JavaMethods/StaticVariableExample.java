package JavaMethods;

public class StaticVariableExample {
    // Static variable with class-level memory
    static int count = 0; // Shared among all objects of the class

    // Constructor increments the static variable
    public StaticVariableExample() {
        count++; // Increment the static variable
    }

    // Static method to display the value of the static variable
    public static void displayCount() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        // Create multiple instances of the class
        StaticVariableExample obj1 = new StaticVariableExample();
        StaticVariableExample obj2 = new StaticVariableExample();
        StaticVariableExample obj3 = new StaticVariableExample();

        // Display the value of the static variable
        StaticVariableExample.displayCount(); // Output: Count: 3

        // Modify the static variable
        StaticVariableExample.count = 10; // Changing its value

        // Display the modified value
        StaticVariableExample.displayCount(); // Output: Count: 10
    }
}
