package patterns11;

import java.util.Arrays;
import java.util.Scanner;

public class maxsumofsubarrayNSQUARE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Scanner s = new Scanner(System.in);
        int a[] = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(find(a,n));
    }

    private static int find(int[] a, int n) {
        int m = Integer.MIN_VALUE;
        int currval, start, end;
        int[] pre = new int[n];
        pre[0] = a[0];
        for(int i=1;i<n;i++){
            pre[i] = pre[i-1]+a[i];
        }
        for(int i=0;i<n;i++){
            start = i;
            for(int j = i; j<n;j++){
                end = j;
                //if start is 0, that means curr ele in prefix will indicate current prefix sum
                //when start is greater than 0, that means the currvalue in pre array indicates prefix sum including the values behind the start value.
                currval = start==0?pre[end]:pre[end]-pre[start-1];
                if(m<currval)   m = currval;
            }
        }
        return m;
    }
}
