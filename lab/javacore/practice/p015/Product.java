package lab.javacore.practice.p015;

public class Product {
    private String name;
    private int price;

    Product() {
    }

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // SET/GET
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    // Method
    public void printName() {
        System.out.println(name);
    }

    public void printPrice() {
        System.out.println(price);
    }
}