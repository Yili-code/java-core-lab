public class Person {
    String name;
    int age;
    String gender;

    Person() {
    }

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void ride(Vehicle v) {
        v.move();
        System.out.println("Person is riding " + v.getBrand() + " at " + v.getSpeed() + " km/h");
        if (v instanceof Bicycle) {
            ((Bicycle)v).ringBell();
        } else if (v instanceof Car) {
            ((Car)v).honk();
        }
    }
}