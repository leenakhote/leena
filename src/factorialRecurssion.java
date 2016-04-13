/**
 * Created by sony on 4/13/2016.
 */

import java.util.Scanner;
public class factorialRecurssion {
    public static void main(String[] args) {
        System.out.println("enter the no :");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int fact = factorial(num);
        System.out.println("factorial is : " + fact);
    }

    static int factorial(int n){
        if(n ==0 ){
            return 1;
        }
        else{
            return (n* factorial(n-1));
        }
    }
}
