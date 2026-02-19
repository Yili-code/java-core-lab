public class Dog extends Animal implements Swim {
    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming...");