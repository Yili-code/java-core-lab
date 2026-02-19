public class Car extends Vehicle {
    Car() {
    }

    Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    public void move() {
        System.out.println("Car is moving...");
    }

    public void honk() {
        System.out.println("Honk the horn...");
    }
}