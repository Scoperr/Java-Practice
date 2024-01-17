package patterns11;

import java.util.*;

public class patternfive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pritnpattern(n);
    }

    private static void pritnpattern(int n) {
        int f;
        for(int lines = 1;lines<=n;lines++){
            if(lines%2==0){
                f = 0;
            }else{
                f = 1;
            }
            for(int no = 1;no<=lines;no++){
                System.out.print(f);
                if(f==0){
                    f=1;
                }else{
                    f=0;
                }
            }
            System.out.println();
        }
    }
}
