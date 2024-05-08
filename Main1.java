// Program to implement the concept of final class.
// Defining a final class named



final class MyFinalClass {
    // Method in the final class
    public void myFinalMethod() {
        System.out.println("This is a final class.");
    }
}

// Main class to demonstrate the final class
public class Main1 {
    public static void main(String[] args) {
        // Creating an instance of the final class
        MyFinalClass finalObj = new MyFinalClass();
        // Calling the method from the final class
        finalObj.myFinalMethod();
    }
}