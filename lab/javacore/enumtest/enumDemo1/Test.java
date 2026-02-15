package lab.javacore.enumtest.enumDemo1;

public class Test {
  public static void main(String[] args) {
    OrderState o1 = OrderState.PAYMENT_PENDING;
    System.out.println(o1.getName());

    switch (o1) {
      case PAYMENT_PENDING -> System.out.println("Payment Pending.");
      case PROCESSING -> System.out.println("Processing.");
      case SHIPPED -> System.out.println("Shipped.");
      case OUT_FOR_DELIVERY -> System.out.println("Out For Delivery.");
      case DELIVERED -> System.out.println("Delivered.");
      case CANCELLED -> System.out.println("Cancelled.");
    }
  }
}
