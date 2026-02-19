public class Rectangle extends Shape {
    double width;
    double height;

    Rectangle() {
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public void length() {
        System.out.println(String.format("%.2f", 2 * (width + height)));
    }

    @Override
    public void area() {
        System.out.println(String.format("%.2f", width * height));
    }
}