import java.util.Scanner;

public class Zero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int x = sc.nextInt();
        int[] y = new int[x];
        int f = 0;
        for (int i = 0; i < x; i++) {
            y[i] = sc.nextInt();
            if (String.valueOf(y[i]).contains("0")) {
                f = 1;
                break;
            }
        }
        if (f == 1) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
