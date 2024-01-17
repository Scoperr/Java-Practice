import java.util.Scanner;

public class nqueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        findqueencount(n,board,0);
    }

    private static void findqueencount(int n, int[][] board, int row) {
        if(n==row){
            printboard(board,n);
            return;
        }
        for(int j=0;j<n;j++){
            if(issafe(row,j, board)){
                board[row][j]=1;
                findqueencount(n, board, row+1);
                board[row][j]=0;
            }
        }
    }

    private static boolean issafe(int row, int col, int[][] board) {
        //check upside, row changes
        for(int rowup=row-1;rowup>=0;rowup--){
            if(board[rowup][col]==1) return false;
        }
        //check down, row changes
        for(int rowdown=row+1;rowdown<board.length;rowdown++){
            if(board[rowdown][col]==1) return false;
        }
        //check left, col changes
        for(int colleft=col-1;colleft>=0;colleft--){
            if(board[row][colleft]==1) return false;
        }
        //check right, col changes
        for(int colright=col+1;colright<board.length;colright++){
            if(board[row][colright]==1) return false;
        }
        //check lefttop,both row and col changes
        for(int r=row-1,c=col-1;r>=0 && c>=0;r--,c--){
            if(board[r][c]==1) return false;
        }
        //check righttop
        for(int r=row-1,c=col+1;r>=0 && c<board.length;r--,c++){
            if(board[r][c]==1) return false;
        }
        //check 
        return true;
    }

    private static void printboard(int[][] board, int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
