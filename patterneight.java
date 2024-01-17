package patterns11;

import java.util.Scanner;

public class patterneight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printpattern(n);
    }

    private static void printpattern(int n) {
        for(int lines = 1; lines <= n; lines++){
            for(int spaces = 1; spaces <= n-lines; spaces++){
                System.out.print(" ");
            }
            if(lines==1 || lines==n){
                for(int line = 1; line<=n; line++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                System.out.print("*");
                for(int space = 1; space<=n-2; space++){
                    System.out.print(" ");
                }
                System.out.print("*\n");
            }
        }
    }
}
