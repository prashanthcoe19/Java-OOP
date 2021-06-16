import java.util.Scanner;

public class Rect {
    int length;
    int breadth;

    // public void setDim(int l, int b) {
    // length = l;
    // breadth = b;
    // }
    public int getArea() {
        int area = length * breadth;
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int l = sc.nextInt();
        System.out.println("Enter breadth");
        int b = sc.nextInt();
        Rect obj = new Rect();
        obj.length = l;
        obj.breadth = b;
        System.out.println(obj.getArea());
        sc.close();
    }
}
