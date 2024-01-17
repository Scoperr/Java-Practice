import java.util.ArrayList;
import java.util.Scanner;


public class nqueen {
    static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nqueen(n);
        for(int i=0;i<n;i++){
            System.out.println(result.get(i).toString());
        }
    }

    private static void nqueen(int n) {
        
        int[][] queen = new int[n][n];
        ArrayList<Integer> temp = new ArrayList<>();
        boolean[] placedinrow = new boolean[n];
        find(queen, n, temp, 0, 0, placedinrow, result);
    }

    private static void find(int[][] queen, int n, ArrayList<Integer> temp, int row, int col, boolean[] placedinrow, ArrayList<ArrayList<Integer>> result) {
        //if the row is n then terminate
        if(row==n){
            if(placedinrow[row-1]){
                result.add(new ArrayList<>(temp));
            }
            return;
        }

        //if the queen is already present in row then go to next row
        if(col==n){
            find(queen, n, temp, row+1, 0, placedinrow, result);
        }
        //if the queen is not there in cur row then we will go throw that row by inc col.
        //to place the queen all the diagonal, left right up and down should be checked
        if(issafe(queen,row, col, n)){
            queen[row][col]=1;
            temp.add(col+1);
            placedinrow[row]=true;
            find(queen, n, temp, row, col+1, placedinrow, result);
            //backtracking
            queen[row][col]=0;
            temp.remove(col);
            placedinrow[row] = false;
            if(!placedinrow[row] && row==0){
                find(queen, n, temp, row, col+1, placedinrow, result);
            }
        }
    }

    private static boolean issafe(int[][] queen, int row, int col, int n) {
        //check from top to bottom and left to right
        for(int r=0;r<n;r++){
            if(queen[r][col]==1) return false;
            if(queen[row][r]==1) return false;
        }
        
        //now checking diagonally
        

        //check right diagonal
        int i=row, j = col;
        //right diag up
        //loop (n-1)-col times for up
        for(int f=0; f<(n-1)-col;f++){
            if(queen[i][j]==1) return false;
            i--;
            j++;
        }
        //right diag down
        i=row;
        j=col;
        for(int f=0; f<(n-1)-row;f++){
            if(queen[i][j]==1) return false;
            i++;
            j--;
        }

        //check left diagonal

        //checking left top
        i=row;
        j=col;
        for(int f=0; f<(n-1)-col;f++){
            if(queen[i][j]==1) return false;
            i--;
            j--;
        }
        //checking left down
        i=row;
        j=col;
        for(int f=0; f<(n-1)-row;f++){
            if(queen[i][j]==1) return false;
            i++;
            j++;
        }

        return true;
    }
}
