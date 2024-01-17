import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class arraylistone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        System.out.println(ismonotonic(a));
    }

    private static boolean ismonotonic(ArrayList<Integer> a) {
        return IntStream.range(0, a.size()-1).allMatch(i -> a.get(i)<=a.get(i+1)) || IntStream.range(0, a.size()-1).allMatch(i -> a.get(i)>=a.get(i+1));
    }
}
