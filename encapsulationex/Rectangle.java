package encapsulationex;

public class Rectangle {
    private int length;
    private int breadth;

    // if we only use get method, our class will be read only,
    // this case we should initialize the constructor
    // public Rectangle(int length, int breadth) {
    // this.length = length;
    // this.breadth = breadth;
    // }

    // public int getLength() {
    // return length;
    // }

    // public int getBreadth() {
    // return breadth;
    // }

    // if we only use set method, our class will be write only
    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    void calcArea() {
        int area = length * breadth;
        System.out.println(area);
    }
}
