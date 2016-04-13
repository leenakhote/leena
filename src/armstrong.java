/**
 * Created by sony on 4/13/2016.
 */

import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        System.out.println("enter the no :");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int n = num ;
        int sum = 0, r ;
        while(num > 0){
            r = num%10 ;
            num = num/10;
            sum = sum + (r*r*r);
        }

        if(n == sum){
            System.out.println("no is armstrong");
        } else {
            System.out.println("no is not armstrong");
        }
    }
}
