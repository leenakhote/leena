/**
 * Created by sony on 4/13/2016.
 */

import java.util.Scanner;
public class selectionSort {
    public static void main(String[] args) {
        int num, i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of integers to sort:");
        num = input.nextInt();

        int array[] = new int[num];
        System.out.println("Enter " + num + " integers: ");

        for(i = 0 ; i <num ; i++){
            array[i] = input.nextInt();
        }

        sort(array);

        System.out.println("Sorted list of integers:");

        for (i = 0; i < num; i++)
            System.out.println(array[i]);
    }

    public static void sort(int arr[]){
        int N = arr.length;
        int i, j, pos, temp;
        for (i = 0; i < N-1; i++)
        {
            pos = i;
            for (j = i+1; j < N; j++)
            {
                if (arr[j] < arr[pos])
                {
                    pos = j;
                }
            }
            /* Swap arr[i] and arr[pos] */
            temp = arr[i];
            arr[i] = arr[pos];
            arr[pos]= temp;
        }

    }
}
