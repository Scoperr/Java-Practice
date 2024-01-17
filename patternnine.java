package patterns11;

import java.util.Scanner;

public class patternnine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printpattern(n);
    }

    private static void printpattern(int n) {
        //print first half
        int f = 1;
        for(int lines = 1; lines <= n; lines++){
            for(int spaces = 1; spaces <= n-lines; spaces++){
                System.out.print(" ");
            }
            for(int stars = 1; stars <= f; stars++){
                System.out.print("*");
            }
            System.out.println();
            f+=2;
        }
        //print second half
        f -= 2;
        for(int lines = n-1; lines >= 0; lines--){
            for(int spaces = 1; spaces <= n-lines; spaces++){
                System.out.print(" ");
            }
            for(int stars = 1; stars <= f; stars++){
                System.out.print("*");
            }
            System.out.println();
            f-=2;
        }
    }
}
