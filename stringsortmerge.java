package patterns11;

import java.util.Scanner;

public class stringsortmerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] l = sc.nextLine().split(" ");
        smerge(l,0,l.length-1);
        for(String s: l){
            System.out.print(s+" ");
        }
    }

    private static void smerge(String[] l, int si, int ei) {
        if(si>=ei)  return;
        int mid = si+(ei-si)/2;
        smerge(l,si,mid);
        smerge(l,mid+1,ei);
        merge(l,si,mid,ei);
    }

    private static void merge(String[] l, int si,int mid, int ei) {
        String[] temp = new String[ei-si+1];
        int ti = 0;
        int i=si;
        int j=mid+1;
        while(i<=mid && j<=ei){
            if(l[i].compareTo(l[j])<0){
                temp[ti] = l[i];
                i++;
            }else{
                temp[ti] = l[j];
                j++;
            }
            ti++;
        }
        while(i<=mid){
            temp[ti++] = l[i++];
        }
        while(j<=ei){
            temp[ti++] = l[j++];
        }
        for(ti=0,i=si;ti<temp.length;i++,ti++){
            l[i] = temp[ti];
        }
    }
}
