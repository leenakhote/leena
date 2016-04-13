/**
 * Created by sony on 4/13/2016.
 */

import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        System.out.println("enter the no :");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int fact =1;

        for(int i=1; i<=num; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of a no is " + fact);
    }
}
