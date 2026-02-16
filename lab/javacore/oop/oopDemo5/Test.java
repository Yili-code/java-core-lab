package lab.javacore.oop.oopDemo5;

public class Test {
  private static final String NL = System.lineSeparator();

  public static void main(String[] args) {
    FirstGenerationPhone ph1 = new FirstGenerationPhone();
    ph1.call();
    System.out.println(NL);

    SecondGenerationPhone ph2 = new SecondGenerationPhone();
    ph2.call();
    ph2.sendMessage();
    System.out.println(NL);

    ThirdGenerationPhone ph3 = new ThirdGenerationPhone();
    ph3.call();
    ph3.sendMessage();
    ph3.playGame();
  }
}
