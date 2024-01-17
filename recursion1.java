package patterns11;

import java.util.Arrays;
import java.util.Scanner;

public class recursion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Scanner s = new Scanner(System.in);
        int key = s.nextInt();
        find(arr, arr.length-1,key);
    }

    private static void find(int[] arr, int n, int key) {
        if(n==0){
            if(arr[n]==key)
            System.out.println(n);
            return;
        }
        if(arr[n]==key)
        System.out.println(n);
        find(arr, n-1, key);
    }
}
