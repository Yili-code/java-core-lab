package lab.javacore.oop.oopDemo6;

public class SmartPhone extends SmartDevice {
  @Override
  public double payment() {
    return super.payment() * 0.9;
  }



}
