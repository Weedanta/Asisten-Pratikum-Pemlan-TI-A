package Encapsulation;

public class Student {
    private String name;
    private int age;
    private int studentId;

    // Constructor
    // public Student(String name, int age, String studentId) {
    //     this.name = name;
    //     this.age = age;
    //     this.studentId = studentId;
    // }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for studentId
    public int getStudentId() {
        return studentId;
    }

    // Setter for studentId
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}