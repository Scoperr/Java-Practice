import java.util.Scanner;

import DP.countOfTargetSum;

public class grid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        find(m,n);
    }

    private static void find(int m, int n) {
        int x=0,y=0;
        System.out.println(count(m,n,x,y));
    }
    //find the number of ways from 0,0 to n-1,m-1 ways only using right and down operations
    
    private static int count(int m, int n, int x, int y) {
        if(x==n-1 && y==m-1) return 1;
        else if(x==n || y==n)   return 0;
        return count(m, n, x+1, y) + count(m, n, x, y+1);
    }
}
