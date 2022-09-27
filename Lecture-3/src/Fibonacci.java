import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0 , b = 1 ;
        for ( int i = 0 ; i < n ; i++ ) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
