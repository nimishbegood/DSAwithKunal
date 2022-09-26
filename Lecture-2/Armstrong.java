import java.util.Scanner;

public class Armstrong {
  public static void main(String[] args) {
    System.out.println("Enter the number:");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int temp = 0, last = 0, digits = 0, sum = 0;
    temp = n;
    while (temp != 0) {
      temp /= 10;
      digits++;
    }

    temp = n;
    while (temp != 0) {
      last = temp % 10;
      sum += Math.pow(last, digits);
      temp /= 10;
    }
    if (n == sum) {
      System.out.println(true);
      return;
    }
    System.out.println(false);
  }
}