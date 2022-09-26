import java.util.Scanner;

public class Dollar {
  public static void main(String[] args) {
    System.out.println("Enter the currency in INR:");
    Scanner input = new Scanner(System.in);
    int dollar = input.nextInt() * 80;
    System.out.println(dollar + " Dollars");
  
  }
 }