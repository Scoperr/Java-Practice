package patterns11;

import java.util.Scanner;

public class patternseven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            printpattern(n);
        }
    }

    private static void printpattern(int n) {
        for(int lines = 1; lines<=n; lines++){
            for(int spaces = 1; spaces<=n-lines; spaces++){
                System.out.print(" ");
            }
            for(int star = 1; star<=n; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
