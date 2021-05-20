package multipleClass;

//it is a good practice to create an object of a class and access it in another class.
// This is often used for better organization of classes (one class has all the attributes and methods, 
// while the other class holds the main() method (code to be executed)).
public class Main {
    public void fullThrottle() {
        System.out.println("Full throttle");
    }

    public void speed(int maxSpeed) {
        System.out.println("car is going on full speed" + maxSpeed);
    }

}
