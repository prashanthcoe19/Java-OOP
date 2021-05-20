public class methods {

    // A method must be declared within a class.
    // static means that the method belongs to the Main class and not an object of
    // the Main class.
    static void myStaticMethod() {
        // static method can by accessed without creating an object of the class
        System.out.println("static method");
    }

    public void myPublicMethod() {
        // public can only be accessed by objects
        System.out.println("public method");
    }

    public static void main(String[] args) {
        myStaticMethod();
        // the static method can be called easily like this.
        // if we call myPublicMethod() it outputs error
        // so we should create object and access through that object

        methods myObj = new methods();
        myObj.myPublicMethod();
    }
}
