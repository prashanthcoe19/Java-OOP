package Tutorial8;

import java.util.Scanner;

public class Car {
    // Instance Variables
    String make;
    String model;
    int engineSize;
    String color;

    // method 1
    public String getInfo() {
        return ("Make of this Car is: " + make + " the model is: " + model + " Its engine is " + engineSize
                + " and the color is: " + color);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Car v1 = new Car();
        Car v2 = new Car();
        System.out.println("Enter make of this Car");
        v2.make = scan.nextLine();
        System.out.println("Enter model of this Car");
        v2.model = scan.nextLine();
        System.out.println("Enter engine size of this Car");
        v2.engineSize = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter color of this Car");
        v2.color = scan.nextLine();
        v1.make = "Toyota";
        v1.model = "Corolla";
        v1.engineSize = 1800;
        v1.color = "white";
        System.out.println(v1.getInfo());
        System.out.println(v2.getInfo());
        scan.close();
    }
}
