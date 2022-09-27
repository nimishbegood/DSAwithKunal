import java.util.Scanner; 

public class SimpleInterest {
  public static void main(String[] args) {
    System.out.println("Enter the principal amount, rate of interest, and the time in the respective order:") ;
    Scanner input = new Scanner(System.in) ;
    int principal = input.nextInt() ;
    int rate = input.nextInt() ;
    int time = input.nextInt() ;
    int interest = (principal*rate*time)/100 ;
    System.out.println("The simple interest calculated is " + interest);
  }
}