package lab.javacore.switchdemo;

import java.util.Scanner;

public class switchDemo1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    switch (num){
      case 1, 2, 3, 4 -> System.out.println("1");
      case 5, 6, 7, 8 -> System.out.println("2");
      default -> System.out.println("Bigger than 2");
    }

    sc.close();
  }
}

// case 後不能寫變量
