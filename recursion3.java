package patterns11;

import java.util.Scanner;

public class recursion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        find(s+"@",0);
    }

    private static void find(String s, int l) {
        if(s.charAt(l)=='@'){
            System.out.println(l);
            return;
        }
        find(s,l+1);
    }
}
