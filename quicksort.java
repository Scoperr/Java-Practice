import java.util.Arrays;
import java.util.Scanner;

public class quicksort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int arr[] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            quick(arr,0,arr.length-1);
            for(int i: arr){
                System.out.print(i+" ");
            }
        }
    }

    private static void quick(int[] arr, int si, int ei) {
        //taking pivot as last element
        //as array gets divided into two parts we need the PROPER INDEX OF PIVOT, so ....
        if(si>=ei)  return;

        int pivot = partition(arr, si, ei);
        quick(arr, si, pivot-1);
        quick(arr, pivot+1, ei);
    }

    private static int partition(int[] arr, int si, int ei) {
        int i=si-1,j;
        for(j=si;j<ei;j++){
            if(arr[j]<=arr[ei]){
                i++;
                //swaping
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        //now we got the pivot correct index position, lets swap the pivot
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
}
