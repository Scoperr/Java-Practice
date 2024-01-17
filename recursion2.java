package patterns11;

import java.util.Scanner;


public class recursion2 {
    public static void main(String[] args) {
        String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(arr,n,"");
    }

    private static void print(String[] arr, int n,String s) {
        if(n==0){
            System.out.println(s);
            return;
        }
        else{
            //System.out.println(arr[n%10]);
            print(arr, n/10, arr[n%10]+" " + s);
        }
    }
}
