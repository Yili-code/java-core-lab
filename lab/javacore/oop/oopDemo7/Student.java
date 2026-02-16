package lab.javacore.oop.oopDemo7;

public class Student extends Person {
  int grade;

  // Constructor
  Student() {
  }

  Student(String name, int age, int grade) {
    super(name, age);
    this.grade = grade;
  }

  // SET/GET method
  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  // Method 
  public void study() {
    System.out.println("study...");
  }
}
