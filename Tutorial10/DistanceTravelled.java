package Tutorial10;

import java.util.Scanner;
import java.io.File;
import java.io.*;

public class DistanceTravelled {
    public static void main(String[] args) throws IOException {
        int distance;
        double day;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance travelled by rocket per day");
        distance = sc.nextInt();
        while (distance < 0) {
            System.out.println("Enter positive value for distance travelled");
            distance = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Enter number of days travelled by rocket");
        day = sc.nextDouble();
        while (day < 1) {
            System.out.println("Days cannot be less than 1. Please Enter valid Day.");
            day = sc.nextDouble();
        }
        sc.nextLine();
        PrintStream newFile = new PrintStream(new File("Tutorial10/Report.txt"));
        // PrintStream console = System.out;
        System.setOut(newFile);
        System.out.printf("%5s %30s", "Day", "Total kms Covered");
        System.out.println();
        System.out.println("-------------------------------------");
        for (int i = 1; i <= day; i++) {
            System.out.format("%5s %2d %20d", "Day", i, distance * i);
            System.out.println();
        }

        sc.close();
    }
}
