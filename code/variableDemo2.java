package code;
import java.util.Scanner;

public class variableDemo2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 只需要建立一個 Scanner object 供全程使用

    System.out.println("Please enter weight (kg): ");
    double weight = sc.nextDouble();
    
    System.out.println("Please enter height (m): ");
    double height = sc.nextDouble();

    double bmi = weight / (height * height);
    System.out.printf("Your BMI is: %.2f%n ", bmi);

    sc.close();
  }
}
