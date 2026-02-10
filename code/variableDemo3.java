package code;
import java.util.Scanner;

public class variableDemo3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter first number: ");
    int num1 = sc.nextInt();
    System.out.printf("num1: %d%n", num1);

    System.out.println("Please enter second number: ");
    int num2 = sc.nextInt();
    System.out.printf("num2: %d%n", num2);

    System.out.printf("num1 + num2 = %d%n", num1+num2);
    sc.close();
  }
}
