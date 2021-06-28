package nestedClass;

// in java is is possible to nest classes
// it's main purpose is to group classes that belong together, 
// makes code more readable and maintanable
// to access inner class, object of outer class should be created
// then creating an object of inner class
class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}

public class Nested {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
