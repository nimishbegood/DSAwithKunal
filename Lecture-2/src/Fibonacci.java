import java.util.Scanner; 
public class Fibonacci {
  public static void main(String[] args) {
    System.out.println("Enter the number of terms:") ;
    Scanner input = new Scanner(System.in);
    int n = input.nextInt() ;
    int n1 = 0 , n2 = 1; 
   

    for ( int i = 1 ; i <= n ; i++ ) {
        System.out.println(n1); ;
   int   sum = n1 + n2 ;
      n1 = n2 ; 
      n2 = sum ; 
    
      
    }
  } 
}