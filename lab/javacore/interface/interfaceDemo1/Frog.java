public class Frog extends Animal implements Swim {
    public Frog() {
    }

    public Frog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("Frog is eating...");
    }

    @Override
    public void swim() {
        System.out.println("Frog is swimming...");
    }
}