import java.lang.*;
import java.util.*;
public class subsetString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        findall(s, s.length(),"",0);
    }

    private static void findall(String s, int length, String string, int index) {
        
        
        if(index==length){
            System.out.println(string);
            return;
        }
        findall(s, length, string+s.charAt(index), index+1);
        findall(s, length, string, index+1);
    }

    
}