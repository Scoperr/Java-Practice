package patterns11;

import java.util.*;

public class patternsix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            printpattern(n);
        }
    }

    private static void printpattern(int n) {
        //print front part
        for(int lines = 1; lines <= n; lines++){
            for(int star = 1;star<=lines;star++){
                System.out.print("*");
            }
            for(int space = 2*n - 2*lines; space>=1; space--){
                System.out.print(" ");
            }
            for(int star = 1;star<=lines;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        //print end part
        for(int lines = n; lines>=1; lines--){
            for(int star = 1;star<=lines;star++){
                System.out.print("*");
            }
            for(int space = 2*n - 2*lines; space>=1; space--){
                System.out.print(" ");
            }
            for(int star = 1;star<=lines;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
