package patterns11;

import java.util.*;

public class patterntwo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            printpattern(n);
        }
    }

    private static void printpattern(int n) {
        int lines, stars, spaces;
        for(lines = 0;lines<n;lines++){
            for(spaces = n-(lines+1);spaces>=0;spaces--){
                System.out.print(" ");
            }
            for(stars = 0;stars<=lines;stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
