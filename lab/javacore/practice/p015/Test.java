package lab.javacore.practice.p015;

public class Test {
    public static void main(String[] args) {
        Product p = new Product("Product", 100);
        p.printName();
        p.printPrice();

        Electronics e = new Electronics("Electronics", 200, "Brand", "Model");
        e.printName();
        e.printPrice();

        Clothing c = new Clothing("Clothing", 300, "Size", "Color");
        c.printName();
        c.printPrice();

        System.out.println();
        System.out.println("Product: " + p.getName() + ", " + p.getPrice());
        System.out.println("Electronics: " + e.getName() + ", " + e.getPrice() + ", " + e.getBrand() + ", " + e.getModel());
        System.out.println("Clothing: " + c.getName() + ", " + c.getPrice() + ", " + c.getSize() + ", " + c.getColor());    
    }
}