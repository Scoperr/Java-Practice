import java.util.Arrays;
import java.util.Scanner;

public class inversioncount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int res = invcount(arr,0,arr.length-1);
        System.out.println(res);
    }

    private static int invcount(int[] arr, int i, int j) {
        return find(arr, i, j);
    }

    private static int find(int[] arr, int si, int ei) {
        //base case
        //if there is only one element then we return 0 cuz there is nothing to sort.
        
        //now we part our arrays as left and right
        int invcount=0;
        if(ei>si){
            int mid = (ei+si)/2;
            invcount=find(arr,si,mid);
            invcount+=find(arr,mid+1,ei);
            invcount+= f(arr,si,mid,ei); 
        } 
        return invcount;  
    }

    private static int f(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei-si+1];
        int count=0;
        int k=0;
        int i=si;
        int j=mid;
        while(i<mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                count+=(mid-i);
                j++;
            }
            k++;
        }
        while(i<mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        for(i=si,k=0;i<=ei;k++,i++){
            arr[i] = temp[k];
        }
        return count;
    }
}
