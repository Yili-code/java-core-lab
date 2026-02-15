package lab.javacore.finall.finalDemo1;

public class Circle {
  private double radi;
  private final double PI = 3.14;

  // contructor
  public Circle() {
  }

  public Circle(double radi) {
    this.radi = radi;
  }

  // GET/SET 
  public double getRadi() {
    return radi;
  }

  public void setRadi(double radi) {
    this.radi = radi;
  }

  public double getPI() {
    return PI;
  }

  // Action
  public double getArea() {
    return PI * radi * radi;
  }

  public double getLength() {
    return PI * radi * 2;
  }
}
