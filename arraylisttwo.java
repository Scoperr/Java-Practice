import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arraylisttwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        System.out.println(findlonelynumbers(a, n));
    }

    private static ArrayList<Integer> findlonelynumbers(ArrayList<Integer> a, int n) {
        ArrayList<Integer> b = new ArrayList<>();
        Collections.sort(a);
        for(int i=0;i<n;i++){
            if(!(a.contains(a.get(i)+1) || a.contains(a.get(i)-1) || a.subList(0, i).contains(a.get(i)) || a.subList(i+1, n).contains(a.get(i)) )){
                b.add(a.get(i));
            }
        }
        return b;
    }

    
}
