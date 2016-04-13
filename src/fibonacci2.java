/**
 * Created by sony on 4/13/2016.
 */

import java.util.Scanner;
public class fibonacci2 {
    public static void main(String[] args) {
        System.out.print("Enter number upto which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println("\n\nFibonacci series upto " + number +" numbers : ");
        //printing Fibonacci series upto number
        for(int i=0; i<=number; i++){
            System.out.print(fibonacciRecusion(i) +" ");
        }
    }

    // Java program for Fibonacci number using recursion.
    public static int fibonacciRecusion(int number) {
        if(number == 0){
            return 0;
        } else if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacciRecusion(number - 1) + fibonacciRecusion(number - 2); //tail recursion
    }
}
