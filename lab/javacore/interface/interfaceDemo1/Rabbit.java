public class Rabbit extends Animal {
    public Rabbit() {
    }

    public Rabbit(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("Rabbit is eating...");
    }
}