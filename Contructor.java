// java constructor is special method that is used to initialize objects
// contructor is called when object of a class is created
public class Contructor {
    int batchYear;
    String studentName;

    // class contructor for Constructor class
    public Contructor(int year, String name) {
        // constructor name must match class name and cannot have return type
        // all classes have constructor by default
        // f you do not create a class constructor yourself, Java creates one for you.
        // However, then you are not able to set initial values for object attributes.
        // constructor can also take parameters
        batchYear = year;
        studentName = name;
    }

    public static void main(String[] args) {
        Contructor myObj = new Contructor(1969, "Eagles"); // this willl call the constructor
        System.out.println("Batch year of " + myObj.batchYear + " is " + myObj.studentName);
    }
}
