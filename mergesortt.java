import java.util.Arrays;
import java.util.Scanner;

public class mergesortt {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter elements -> ");
            int arr[] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            //first we SPLIT arr
            mergesort(arr,0,arr.length-1);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }

    private static void mergesort(int[] arr, int si, int ei) {
        if(si>=ei)  return;
        int mid = si+(ei-si)/2;
        //first we merge left side and then right side
        mergesort(arr,0,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }

    private static void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        //we compare left arr with right arr and store 
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(k=0,i=si;k<temp.length;i++,k++){
            arr[i] = temp[k];
        }
    }
}
