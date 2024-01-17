import java.util.Scanner;

public class stringpermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        findall(s, "");
    }

    private static void findall(String s, String string) {
        if(s.length()==0){
            System.out.println(string);
            return;
        }
        for(int i=0;i<s.length();i++){
            char cur =s.charAt(i);
            String newchar = s.substring(0,i)+s.substring(i+1);
            findall(newchar, string+cur);
        }
    }
}
