package code;
import java.util.Scanner;

public class operatorDemo3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter a number: ");
    int num = sc.nextInt();

    if (num > 9999 || num < 0) System.out.println("False");

    if ((num / 1000 == num % 10) && (num / 100 % 10 == num / 10 % 10)) {
      System.out.printf("%d is palindrome. %n", num);
    } else {
      System.out.printf("%d is not palindrome.", num);
    }

    sc.close();
  }
}