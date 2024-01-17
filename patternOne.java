package patterns11;

import java.util.*;

class patternOne{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            printpattern(n);
        }
    }

    private static void printpattern(int n) {
        for(int i=0;i<n;i++){
            if(i==0 || i==n-1){
                for(int j = 0;j<5;j++)  System.out.print("*");
                System.out.println();
            }
            else{
                System.out.println("*   *");
            }
        }
    }
}