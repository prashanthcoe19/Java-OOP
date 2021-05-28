//access modifier
// for classes we can use:
// public:> this is accessible by any other class
// default:> The class is only accessible by classes in the same package. This is used when you don't specify a modifier.
// for attributes methods and constructors:
// public:> code is accessible for all classes
// private:> code is only accessible within declared class
//protected:>The code is accessible in the same package and subclasses.

public class accessmod {
    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        accessmod myObj = new accessmod();
        // myObj.x = 50; // will generate an error: cannot assign a value to a final
        // variable
        // myObj.PI = 25; // will generate an error: cannot assign a value to a final
        // variable
        System.out.println(myObj.x);
    }
}
