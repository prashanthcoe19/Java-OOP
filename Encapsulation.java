// encapsulation is to make sure that sensitive data is hidden from users.
// to acheive this: declare variables/attributes as private 
// and provide public get and set methods to access and update the value of a private variable
// private variable can only be accessed within the same class. however we can access if we provide public get and set methods
// get method returns the variable value and set method sets the value

public class Encapsulation {
    public String name;

    // getter
    // this method return value of variable name
    public String getName() {
        return name;
    }

    // // // setter
    // // // takes a parameter (newName) and assigns it to name variable
    // // // this keyword is used to refer to current object
    public void setName(String newName) {
        this.name = newName;
    }
}

class Main {
    public static void main(String[] args) {
        Encapsulation myObj = new Encapsulation();
        myObj.setName("John");// set value of name var to john
        System.out.println(myObj.getName());
    }
}

// better control of class attributes and methods
// class attributes can be made read-only or write-only
// flexible plus increased security of data