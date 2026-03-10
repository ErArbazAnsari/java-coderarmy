
public class main {
    public static void main(String[] args) {
        EngineeringStudent s1 = new EngineeringStudent("arbaz", 100);
        s1.attendLabs(100);
        s1.markAttendance(100);
        s1.getInfo();
    }
}

class Student {
    private String name;
    private int rollNumber;

    Student(String name, int roll) {
        this.name = name;
        this.rollNumber = roll;
    }

    public void markAttendance(int rollNumber) {
        System.out.println("attendance marked for: " + rollNumber);
    }

    public void getInfo() {
        System.out.println("name: " + this.name);
        System.out.println("rollNumber: " + this.rollNumber);
    }
}

class EngineeringStudent extends Student {
    EngineeringStudent(String name, int roll) {
        super(name, roll);
    }

    public void attendLabs(int rollNumber) {
        System.out.println("lab attended: " + rollNumber);
    }
}