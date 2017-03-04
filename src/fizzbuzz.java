/**
 * Created by sony on 6/16/2016.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class fizzbuzz {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int a[] = new int[t];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int i = 0;
        while(st.hasMoreTokens()){
            a[i++] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < t; ++j) {
            int num = a[j];
            for (int k = 1; k <= num; ++k) {
                if (k % 15 == 0)
                    System.out.println("FizzBuzz");
                else if (k % 3 == 0)
                    System.out.println("Fizz");
                else if (k % 5 == 0)
                    System.out.println("Buzz");
                else
                    System.out.println(k);
            }
        }
    }
}
 /*

import java.util.Scanner;
public  class fizzbuzz{
    public static void main(String[] args) {
        System.out.print("Enter number upto which series to print: ");
        int number = new Scanner(System.in).nextInt();

        for (int i=1 ; i<=number ; i++){
            if(i % 15 == 0){
                System.out.println("FizzBuzz");
            }else if( i % 5 == 0){
                System.out.println("Buzz");
            }else if(i % 3 ==0){
                System.out.println("Fizz");
            }else{
                System.out.println(i);
            }
        }
    }
}*/