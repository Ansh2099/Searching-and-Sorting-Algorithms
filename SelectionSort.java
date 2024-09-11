import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static void selectionsort(int[] arr){

        for(int i = 0; i < arr.length; i++){

            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[i]){

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }

        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int arrayLength = sc.nextInt();

        int[] array = new int[arrayLength];

        for(int m = 0; m < arrayLength; m++){
            array[m] = sc.nextInt();
        }

        selectionsort(array);

        System.out.println(Arrays.toString(array));

        sc.close();

    }
}