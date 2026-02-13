package practice;
import java.util.Scanner;

public class p008 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      float num = sc.nextInt();
      if (num < 0) {
        System.out.println("Stop!");
        break;
      }

      if (num < 1.0) {
        System.out.println("10$");
      } else if (num > 1.0 && num <= 5.0) {
        System.out.println(money(num));
      }
    }
  }

  public static string money(int num) {
    
  }
}
