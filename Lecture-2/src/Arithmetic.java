import java.util.Scanner;

public class Arithmetic {
  public static void main(String[] args) {
    System.out.println("Enter two numbers:");
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int sum = a + b , product = a * b , difference = a - b ; 
    if ( b != 0 ) {
      int quotient = a / b ;
      System.out.print("The sum of the two numbers is " + sum + ". The product is " + product + ". The difference is " + difference + ". The quotient is " + quotient + ".") ;
    } else {
      System.out.print("The sum of the two numbers is " + sum + ". The product is " + product + ". The difference is " + difference + ". The division is not possible as the operation tends to infinity") ;
    }
   
  }
}