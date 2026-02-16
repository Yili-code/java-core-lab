package lab.javacore.practice.p015;

public class Electronics extends Product {
    private String brand;
    private String model;

    Electronics() {
    }

    Electronics(String name, int price, String brand, String model) {
        super(name, price);
        this.brand = brand;
        this.model = model;
    }

    // SET/GET
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}   