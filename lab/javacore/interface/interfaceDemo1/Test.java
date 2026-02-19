public class Test {
    public static void main(String[] args) {
        Animal a = new Dog("Dog", "Black");
        a.eat();
        ((Dog)a).swim();

        Animal a2 = new Frog("Frog", "Green");
        a2.eat();
        ((Frog)a2).swim();

        Animal a3 = new Rabbit("Rabbit", "White");
        a3.eat();
    }

    public static void useSwim(Swim s) {
        s.swim();
    }

    public static void useAnimal(Animal a) {
        a.eat();
    }

    public static void useSwim(Swim s) {
        s.swim();
    }
}