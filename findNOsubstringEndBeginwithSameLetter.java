package patterns11;

import java.util.Scanner;

public class findNOsubstringEndBeginwithSameLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        int n = s.length();
        findCount(s,0,n-1,0,n);
    }
    public static void findCount(String s, int i, int j, int count, int n){
        //we do this bcuz, when i comes to end of string then we just stop everything
        //this is base case know so we keep first
        //first we base case and then we go to main code
        if(i==n-1){
            System.out.println(count);
            return;
        }
        //here we do this cuz, when j goes negative then we inc i and set j to n-1
        //same hereee
        if(j<0){
            i++;
            j=n-1;
        }
        //here we compare till i<=j you know reason
        if(s.charAt(i)==s.charAt(j) && i<=j){
            System.out.println(s.substring(i,j+1));
            count++;
        }
        findCount(s,i,j-1,count,n);
    }
}
