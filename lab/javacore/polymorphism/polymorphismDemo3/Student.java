public class Student {
    String name;
    int age;

    Student() {
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void useShape(Shape s) {
        System.out.println("Student is using " + s.getName());
        s.computeLength(s);
        s.computeArea(s);
    }


}