package lab.javacore.enumtest.enumDemo1;

public enum OrderState {
  // list every object in this class
  PAYMENT_PENDING("payment_pending"),
  PROCESSING("processing"), 
  SHIPPED("shipped"),
  OUT_FOR_DELIVERY("out_for_delivery"),
  DELIVERED("delivered"),
  CANCELLED("cancelled");

  private String name;

  OrderState(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
