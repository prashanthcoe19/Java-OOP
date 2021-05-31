package Tutorial9;

public class Student {
    private String Name;
    private String ID;
    private String Email;

    public Student(String name, String id, String email) {
        Name = name;
        ID = id;
        Email = email;
    }

    // accesser method
    public String getName() {
        return Name;
    }

    public String getID() {
        return ID;
    }

    public String getEmail() {
        return Email;
    }

    // mutator method
    public String setName(String name) {
        return this.Name = name;
    }

    public String setID(String id) {
        return this.ID = id;
    }

    public String setEmail(String email) {
        return this.Email = email;
    }

    public static void main(String[] args) {
        Student myStd = new Student("Name", "ID", "Email");
        myStd.setName("Name");
        myStd.setID("1234");
        myStd.setEmail("student@email.com");
        System.out.println(myStd.getName());
        System.out.println(myStd.getID());
        System.out.println(myStd.getEmail());
    }

}