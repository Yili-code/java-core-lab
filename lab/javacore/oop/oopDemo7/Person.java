package lab.javacore.oop.oopDemo7;

public class Person {
  private String name;
  private int age;

  // Constructor
  Person() {
  }

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // GET/SET method
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // Method
  public void eat() {
    System.out.println("eatting...");
  }

  public void sleep() {
    System.out.println("sleeping...");
  }
}
