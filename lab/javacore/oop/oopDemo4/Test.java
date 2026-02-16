public class Test {
  public static void main(String[] args) {
    Student s = new Student();
    s.age = 20;
    s.name = "Yili";
    s.grade = 5;
    System.out.println(String.format("%s, %d, %d", s.name, s.age, s.grade));

    Teacher t = new Teacher();
    t.name = "adsf";
    t.age = 19;
    t.subject = "afdadfa";
    System.out.println(String.format("%s, %d, %s", t.name, t.age, t.subject));
  }
}
