import java.util.*;

class MergeSortImplementation {
    
    private static void mergeSort(int[] arr, int l, int r){
        
        if(l < r){
            
            int mid = (l+r)/2;
            
            mergeSort(arr, l , mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
            
        }
    }
    
    private static void merge(int[] arr, int l, int mid, int r){
        
        int n1 = mid - l + 1;
        int n2 = r - mid;
        
        int[] lArr = new int[n1];
        int[] rArr = new int[n2];
        
        for(int x = 0; x < n1; x++){
            lArr[x] = arr[l + x];
        }
        
        for(int y = 0; y < n2; y++){
            rArr[y] = arr[mid + 1 + y];
        }
        
        int i = 0;
        int j = 0;
        int k = l;
        
        while(i < n1 && j < n2){
            if(lArr[i] <= rArr[j]){
                arr[k] = lArr[i++];
            }else{
                arr[k] = rArr[j++];
            }
            k++;
        }
        
        if(i < n1){
            arr[k++] = lArr[i++];
        }
        
        if(j < n2){
            arr[k++] = rArr[j++];
        }
        
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter you array size:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        System.out.println("Enter you array to be sorted:");
        
        for(int i = 0; i < array.length - 1; i++){
            array[i] = scanner.nextInt();
        }
        
        System.out.println("Your Original Array is:");
        System.out.println(Arrays.toString(array));
    
        int l = 0;
        int r = array.length - 1;
        mergeSort(array, l, r);
        
        System.out.println("The Merge Sorted Array is:");
        System.out.println(Arrays.toString(array));
        
        }
    }
