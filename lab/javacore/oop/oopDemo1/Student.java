// javabean
package lab.javacore.oop.oopDemo1;

public class Student {
    // private member variables
    private String name;
    private int age;
    private int height;
    private String gender;

    
    // constructor
    public Student() {
        System.out.println("01 Student constructor called");
    }

    public Student(String name, int age, int height, String gender) {
        System.out.println("02 Student constructor called");
    }
    // setter methods
    public void setName(String name) {
        this.name = name;
    }
    // getter methods
    public String getName() {
        return name;
    }
    
}