package lab.javacore.practice.p014;

public class Test {

  private static void printEmployee(String label, Employee e) {
    System.out.println(label + ": " + e.getStaffId() + " " + e.getName() + " " + e.getWork());
  }

  public static void main(String[] args) {
    Lecturer lecturer = new Lecturer(101, "張老師", "授課");
    Tutor tutor = new Tutor(102, "李助教", "輔導");
    Maintainer maintainer = new Maintainer(201, "王維修", "設備維護");
    Buyer buyer = new Buyer(202, "陳採購", "採購");

    printEmployee("Lecturer", lecturer);
    printEmployee("Tutor", tutor);
    printEmployee("Maintainer", maintainer);
    printEmployee("Buyer", buyer);
    System.out.println();

    Employee e1 = new Lecturer(103, "趙教授", "教學研究");
    Employee e2 = new Maintainer(203, "孫維修", "水電");
    Teacher t = new Tutor(104, "周助教", "實習課");
    AdminStaff a = new Buyer(204, "吳採購", "教材採購");

    printEmployee("Employee(Lecturer)", e1);
    printEmployee("Employee(Maintainer)", e2);
    printEmployee("Teacher(Tutor)", t);
    printEmployee("AdminStaff(Buyer)", a);
    System.out.println();

    lecturer.setName("張教授");
    buyer.setStaffId(299);
    System.out.println("Lecturer 改名後: " + lecturer.getName());
    System.out.println("Buyer 改編號後: " + buyer.getStaffId());
  }
}
