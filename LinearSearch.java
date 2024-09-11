import java.util.Scanner;

public class LinearSearch {

    // Searches a number in an array and returns the index of its first instance, if not found returns -1

    public static int linearSearch(int arr[], int numberToFind, int x) {
        for (int i = 0; i < x; i++) {
            if (arr[i] == numberToFind) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int lengthOfArray = sc.nextInt();

        int[] array = new int[lengthOfArray];

        for (int m = 0; m < lengthOfArray; m++) {
            array[m] = sc.nextInt();
        }

        int number = sc.nextInt();
        
        int result = linearSearch(array, number, lengthOfArray);
        System.out.println(result);
        sc.close();
    }
  }
