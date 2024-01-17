import java.util.Arrays;
import java.util.Scanner;

public class majorityelement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int res = majority(arr, 0, arr.length-1);
            System.out.println(res);
        }
    }

    private static int majority(int[] arr, int si, int ei) {
        return m(arr, si, ei);
    }

    private static int m(int[] arr, int si, int ei) {
        //base case
        //if there is only one element
        if(si==ei) return arr[si];

        //we need to find the majority of left and right parts of arr that means we need to find the count of each element also.
        //so first we divide
        int mid = si+(ei-si)/2;
        //now left part
        int left = m(arr, si, mid);
        int right = m(arr, mid+1, ei);
        if(left==right) return left;
        //now we need to find the count
        int countofleft = c(arr,si,ei,left);
        int countofright = c(arr,si,ei,right);
        return countofleft>countofright?left:right;
    }

    private static int c(int[] arr, int i, int ei, int key) {
        int count=0;
        for(int k=i;k<=ei;k++){
            if(arr[k]==key) 
                count++;
        }
        return count;
    }
}
