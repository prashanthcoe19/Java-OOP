import java.util.Scanner;

public class Inheritance {

    static class Employee {
        int calcSalary(int days, int wage) {
            int salary = days * wage;
            return salary;
        }
    }

    static class Programmer extends Employee {
        int bonus = 10000;
    }

    static class Holiday extends Programmer {
        int holiday = 15;
    }

    public static void main(String args[]) {
        Holiday h = new Holiday();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of days the employee worked");
        int days = s.nextInt();
        System.out.println("Enter wage per day");
        int wage = s.nextInt();
        int sa = h.calcSalary(days, wage);
        System.out.println(sa);
        System.out.println(h.bonus);
        System.out.println(h.holiday);
    }
}
