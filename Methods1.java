public class Methods1 {
    public void fullThrottle() {
        System.out.println("full throttle");
    }

    public void speed(int maxSpeed) {
        System.out.println("this car is going full speed " + maxSpeed);
    }

    public static void main(String[] args) {
        Methods1 myCar = new Methods1();
        myCar.fullThrottle();
        myCar.speed(450);
        // ( . ) is used to access object attribute and methods
        // To call a method in Java, write the method name followed by a set of
        // parentheses (),
        // followed by a semicolon (;).
        // a class must have matching fileName(Methods1 and Methods1.java)
    }
}
