/**
 * Created by sony on 4/13/2016.
 */
import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        System.out.println("enter the no :");
        Scanner input =  new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(num);
        int n = num;
        int temp, r, sum=0;
        while(num > 0){
            r = num %10 ;
            sum = sum*10 +r ;
            num = num/10 ;
        }

        if(n == sum){
            System.out.println("number is palindrome");
        }
        else {
            System.out.println("number is not palindrome");
        }
    }
}
