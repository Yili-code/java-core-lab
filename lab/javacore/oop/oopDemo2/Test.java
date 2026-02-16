package lab.javacore.oop.oopDemo2;

public class Test {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "One";
    s1.age = 18;
    s1.teachername = "Zero";
    s1.region = "A";

    Student s2 = new Student();
    s2.name = "Two";
    s2.age = 19;

    System.out.println(String.format("%s, %d, %s, %s", s1.name, s1.age, s1.teachername, s1.region));
    System.out.println(String.format("%s, %d, %s, %s", s2.name, s2.age, s2.teachername, s2.region));
  }
}