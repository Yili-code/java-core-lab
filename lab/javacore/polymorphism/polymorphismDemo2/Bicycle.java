public class Bicycle extends Vehicle {
    Bicycle() {
    }

    Bicycle(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void move() {
        System.out.println("Bicycle is moving...");
    }

    public void ringBell() {
        System.out.println("Ring the bell...");
    }
}