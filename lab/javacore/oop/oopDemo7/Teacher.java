package lab.javacore.oop.oopDemo7;

public class Teacher extends Person {
  private String subject;

  // Constructor
  Teacher() {
  }

  Teacher (String name, int age, String subject) {
    super(name, age);
    this.subject = subject;
  }

  // SET/GET Method
  public void setSubject(String subject) {
    this.subject = subject;
  } 

  public String getSubject() {
    return subject;
  }

  // Method
  public void teach () {
    System.out.println("teaching...");
  }
}
