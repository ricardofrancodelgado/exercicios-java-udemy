import java.util.Scanner;

import entities.Rectangle;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter rectangle width and height");

    Rectangle rect = new Rectangle();

    rect.width = sc.nextDouble();
    rect.height = sc.nextDouble();

    System.out.printf("Area: %.2f%n", rect.area());
    System.out.printf("Perimeter: %.2f%n", rect.perimeter());
    System.out.printf("Diagonal: %.2f%n", rect.diagonal());

    sc.close();
  }
}
