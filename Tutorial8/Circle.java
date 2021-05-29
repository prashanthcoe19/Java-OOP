package Tutorial8;

public class Circle {
    public double x, y; // centre of the circle
    public double r; // radius of circle
    public String c;// color of circle
    // Methods to return circumference and area

    public double circumference() {
        return 2 * 3.14 * r;
    }

    public double area() {
        return 3.14 * r * r;
    }

    public String color() {
        return c;
    }
}

class MyMain {
    public static void main(String args[]) {
        Circle aCircle; // creating reference
        aCircle = new Circle(); // creating object
        aCircle.x = 10; // assigning value to data field
        aCircle.y = 20;
        aCircle.r = 5;
        aCircle.c = "Black";
        double area = aCircle.area();
        double circumf = aCircle.circumference();
        String color = aCircle.color();
        System.out.println("Radius=" + aCircle.r + " Area=" + area);
        System.out.println("Circumference =" + circumf);
        System.out.println("Color=" + color);
    }
}