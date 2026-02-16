package lab.javacore.oop.oopDemo5;

public class Test {
  public static void main(String[] args) {
    FirstGenerationPhone ph1 = new FirstGenerationPhone();
    ph1.call();

    System.out.println();

    SecondGenerationPhone ph2 = new SecondGenerationPhone();
    ph2.call();
    ph2.sendMessage();

    System.out.println();

    ThirdGenerationPhone ph3 = new ThirdGenerationPhone();
    ph3.call();
    ph3.sendMessage();
    ph3.playGame();

    System.out.println();
  }
  
}
