/**
 * Created by sony on 4/13/2016.
 */

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
public class primeNumber {
    public static void main(String args[])
    {
        int num;
        int flag=0;
        System.out.println("Enter the no :");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        for(int i=2;i<num;i++){
            if(num%i==0)
            {
                System.out.println(num+" is not a Prime Number");
                flag = 1;
                break;
            }
        }
        if(flag==0)
            System.out.println(num+" is a Prime Number");
    }
}
