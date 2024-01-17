package patterns11;

import java.util.Scanner;

public class patternfour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printpattern(n);
    }

    private static void printpattern(int n) {
        int num = 1;
        for(int lines = 1;lines <= n; lines++){
            for(int f = 1;f<=lines;f++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();

        }
    }
}
