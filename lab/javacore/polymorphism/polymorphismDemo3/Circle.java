public class Circle extends Shape {
    double radius;
    final double PI = 3.14;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public void length() {
        System.out.println(String.format("%.2f", 2 * PI * radius));
    }

    @Override
    public void area() {
        System.out.println(String.format("%.2f", PI * radius * radius));
    }
}