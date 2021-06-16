public class Employee {
    int salary;
    int hours;

    public void getInfo(int s, int h) {
        salary = s;
        hours = h;
    }

    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    public void addWork() {
        if (hours > 6) {
            salary += 5;
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.getInfo(450, 8);
        e.addSal();
        e.addWork();
        System.out.println("salary is " + e.salary);
    }
}
