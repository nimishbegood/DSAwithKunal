import java.util.Scanner;

public class Palindrome {
  public static void main ( String[] args) {
    System.out.println("enter the string:");
    Scanner input = new Scanner(System.in);
    String str = input.next();
    String rev = "" ;
    int i = str.length()-1 ;
    while ( i >= 0 ) {
      rev += str.charAt(i) ;
      i-- ;
    }
    if ( rev.equals(str) ) {
      System.out.print(true);
      return;
    }
    System.out.print(false);
  }
}