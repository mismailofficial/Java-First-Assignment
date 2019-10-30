class Student {
    public static Student newStudent() {
        return new Student("Ali");
    }
    private int rollNo;
    private String name;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Student(int r, String n) {
        this(n);
        rollNo = r;
    }
    void sayHello() {
        System.out.println("Hello");
    }
    Student(String n) {
        name = n;
    }
}

public class Encap1 {
    public static void main(String[] args) {
//        Student s1 = new Student(123, "Ali");
//        Student s2 = new Student("Hamza");
//
//        System.out.println(s1.getName());
//        System.out.println(s2.getName());
//
//        Student s3 = Student.newStudent();
        System.out.println(Clock.newClock().toString());
    }
}
