import java.util.Scanner;
public class Comparison {
  public static void main(String[] args) {
    System.out.println"Enter the two numbers");
    Scanner input = new Scanner(System.in) ;
    
    int a = input.nextInt() ;
    int b = input.nextInt() ;
    if ( a > b ) {
      System.out.println(a + " is greater than " + b ) ;
    } else {
       System.out.println(b + " is greater than " + a ) ;
    }
  }
}