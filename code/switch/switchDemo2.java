
public class switchDemo2 {
  public static void main(String[] args) {
    int number = 0;
    String str = switch (number) {
      case 1, 2, 3, 4 -> "A";
      case 5, 6, 7, 9 -> "B";
      default -> "C";
    };

    System.out.printf(str);
  }
}

// yield