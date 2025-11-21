
public class Sudo {
    public boolean isSafe(int [][]board,int row,int col,int num){
        for(int c=0;c<=8;c++){
            if(board[row][c]==num){
                return false;
            }
        }
        for(int r=0;r<=8;r++){
            if(board[r][col]==num){
                return false;
            }
        }
        int startrow=row-(row%3);
        int startcol=col-(col%3);
         for(int r = startrow; r < startrow + 3; r++) {
            for(int c = startcol; c < startcol + 3; c++) {
                if(board[r][c] == num) {
                    return false;
                }
            }
        }
        
        return true; 
    }

    public boolean solvesudoku(int [][]board){
        int row=-1;
        int col=-1;
        boolean emptyfound=false;
        for(int r=0;r<=8;r++){
            for(int c=0;c<=8;c++){
                if (board[r][c]==0){
                row=r;
                col=c;
               emptyfound=true;
               break;
            }
        }
        if(emptyfound){
            break;
        }
        }
        if(emptyfound==false){
            return true;
        }
        for (int num=1;num<=9;num++){
    if (isSafe(board, row, col, num)){
        board[row][col]=num;
        if (solvesudoku(board)){
            return true;
        }
            board[row][col]=0;
        
    } 
    }
      return false;
 }

 public static void main(String[] args){

        int[][] board = {
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
        };

        Sudo s = new Sudo();

        if(s.solvesudoku(board)){
            System.out.println("Solved Sudoku:\n");
            for(int r=0;r<9;r++){
                for(int c=0;c<9;c++){
                    System.out.print(board[r][c] + " ");
                }
                System.out.println();
            }
        } 
        else {
            System.out.println("No solution exists.");
        }
    }
}