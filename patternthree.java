package patterns11;

import java.util.Scanner;

public class patternthree {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            printpattern(n);
        }
    }

    private static void printpattern(int n) {
        for(int lines=n;lines>=1;lines--){
            for(int num=1;num<=lines;num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
