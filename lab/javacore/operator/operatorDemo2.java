package lab.javacore.operator;

import java.util.Scanner;

public class operatorDemo2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter a character: ");
    char ch = sc.next().charAt(0);
    // `sc.next()`            return String
    // `sc.next().charAt(0)`  return Char
    
    char result = (char) 0;
    if (ch >= 'A' && ch <= 'Z') {
      result = (char) (ch + 32); 
    } else if (ch >= 'a' && ch <= 'z') {
      result = (char) (ch - 32); 
    } else {
      result = ch; 
      System.out.println("Notice: This is not an alphabetic character.");
    }
    
    System.out.printf("Your input is %c, and its lower pattern is %c", ch, result);

    sc.close();
  }
}
