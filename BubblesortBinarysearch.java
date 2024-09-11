import java.util.Scanner;

public class BubblesortBinarysearch{

    public static int[] bubblesort(int arr[]){

        for(int i = 0; i < arr.length - 1; i++){
            boolean swapped = false;

            for(int j = 0; j < arr.length - 1 - i; j++){
                
                if(arr[j] > arr[j + 1]){

                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }
    
    public static int binarysearch(int[] brr, int toFind){

        int low = 0;
        int high = brr.length - 1;

        while(low <= high){

            int mid = low + (high-low)/2;

            if(brr[mid] == toFind){
                return mid;
            } else if(brr[mid] > toFind){
                high = mid - 1;
            } else if(brr[mid] < toFind){
                low = mid + 1;
            }
        }
        return toFind;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arraylength = sc.nextInt();

        int[] array = new int[arraylength];

        for(int m = 0; m < arraylength; m++){
            array[m] = sc.nextInt();
        }

        int[] result = bubblesort(array);

        int toFind = binarysearch(result, 7);

        System.out.println(toFind);

        sc.close();
    }
}