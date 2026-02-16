package lab.javacore.practice.p015;

public class Clothing extends Product {
    private String size;
    private String color;

    Clothing() {
    }

    Clothing(String name, int price, String size, String color) {
        super(name, price);
        this.size = size;
        this.color = color;
    }

    // SET/GET
    public void setSize(String size) {
        this.size = size;
    }   

    public String getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}