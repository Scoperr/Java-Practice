package patterns11;

import java.util.Arrays;
import java.util.Scanner;

public class kadaene {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Scanner s = new Scanner(System.in);
        int a[] = Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(find(a,n));
    }

    private static int find(int[] a, int n) {
        int cs = 0;
        int m = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            cs+=a[i];
            if(cs<0) cs=0;
            m = Math.max(m,cs);
        }
        return m;
    }
}
