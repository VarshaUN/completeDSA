public class backtracking {

    //Nqueens problem solution

    public static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonally left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diadonally right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    //function to place n queens in n rows
    public static void nQueens(char board[][],int row){
        if(row==board.length){
            printBoard(board);
            return;
        }
        //column loop
        for(int j=0;j<board.length;j++){
           if(isSafe(board, row, j)){
            board[row][j]='Q';
            nQueens(board, row+1);
            board[row][j]='X'; //backtrack step
           }
        }
    }
    //print function
    public static void printBoard(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
 public static void main(String args[]){
    int n=4;
  char board[][]=new char[n][n];
  //initialize
  for(int i=0;i<board.length;i++){
    for(int j=0;j<board.length;j++){
        board[i][j]='X';
    }
  }
  nQueens(board, 0);

 }
}