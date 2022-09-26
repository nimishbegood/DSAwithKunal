import java.util.Scanner;

public class EvenOdd {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    if (input.nextInt() % 2 == 1) {
      System.out.print("Odd");
    } else {
      System.out.print("Even");
    }
  }
}