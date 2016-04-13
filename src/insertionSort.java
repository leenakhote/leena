import java.util.Scanner;

/**
 * Created by sony on 4/13/2016.
 */
public class insertionSort {
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
        for (int i = 1; i < arr.length; i++) {
            int valueToSort = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > valueToSort) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = valueToSort;
        }
    }
}
