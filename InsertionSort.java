import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void Insertionsort(int arr[]){

        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
          
            while(j >= 0 && arr[j] > key){

                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key; 
        }    
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int arrayLength = sc.nextInt();

        int[] array = new int[arrayLength];

        for(int m = 0; m < arrayLength; m++){
            array[m] = sc.nextInt();
        }

        Insertionsort(array);

        System.out.println(Arrays.toString(array));

        sc.close();
    }
}
