package patterns11;

import java.util.Scanner;

public class patterneleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printpattern(n);
    }

    private static void printpattern(int n) {
        int x=1;
        int no = 2;
        for(int lines = 1; lines <= n; lines++){
            for(int spaces = 1; spaces <= n-lines; spaces++){
                System.out.print(" ");
            }
            if(lines==1){
                System.out.println(1);
            }
            else{
                for(int a = no;a>=1;a--){
                    System.out.print(a+"");
                }
                int f = 2;
                for(int b = 1; b<=no-1;b++,f++){
                    System.out.print(f+"");
                }
                System.out.println();
                no++;
            }
        }
    }
}
