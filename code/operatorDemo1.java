package code;
import java.util.Scanner;

public class operatorDemo1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int second = sc.nextInt();

    int hour = second / 3600;
    second = second - hour * 3600;

    int min = second / 60;
    second = second - min * 60;

    System.out.printf("%d %d %d%n", hour, min, second);
    sc.close();
  }
}
