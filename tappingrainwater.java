package patterns11;
import java.util.Arrays;
import java.util.Scanner;
public class tappingrainwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Scanner s = new Scanner(System.in);
        int a[] = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(find(a,n));
    }

    private static int find(int[] a, int n) {
        int count=0;
        int[] leftmax = new int[n];
        int[] rightmax = new int[n];
        leftmax[0] = a[0];
        rightmax[n-1] = a[n-1];
        for(int i=1,j = n-2;i<n && j>=0;i++,j--){
            leftmax[i] =   Math.max(a[i],leftmax[i-1]);
            rightmax[j] = Math.max(a[j], rightmax[j+1]);
            System.out.println(leftmax[i]+" "+rightmax[j]);
        }
        for(int i=0;i<n;i++){
            int f = Math.min(leftmax[i],rightmax[i]) - a[i];
            if(f<0) f=0;
            count+=f;
        }
        return count;
    }
}
