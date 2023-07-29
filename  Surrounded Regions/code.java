class Solution {
    public void solve(char[][] board) {
        if(board.length==0||board[0].length==0){
            return;
        }
        //in this we are gonna implement the boundary dfs algo
        int row=board.length;
        int col=board[0].length;
        for(int i=0;i<row;i++){
            if(board[i][0]=='O'){
                boundarydfs(i,0,board);
            }
            if(board[i][col-1]=='O'){
                boundarydfs(i,col-1,board);
            }

        }
        for(int j=0;j<col;j++){
            if(board[0][j]=='O'){
                boundarydfs(0, j, board);
            }
            if(board[row-1][j]=='O'){
                boundarydfs(row-1, j, board);
            }
        }

        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';

                }
                else if(board[i][j]=='*'){
                    board[i][j]='O';
                }
            }
        }
        
    }
    public void boundarydfs(int i, int j , char[][] board){
        if(i<0||i>board.length||j<0||j>=board[0].length){
            return;
        }
        if(board[i][j]=='O'){
            board[i][j]='*';
        }
        if(i>0 && board[i-1][j]=='O'){
            boundarydfs(i-1, j, board);
        }
        if(i<board.length-1 && board[i+1][j]=='O'){
            boundarydfs(i+1, j, board);
        }
        if(j>0 && board[i][j-1]=='O'){
            boundarydfs(i, j-1, board);
        }
        if(j<board[0].length-1 && board[i][j+1]=='O'){
            boundarydfs(i, j+1, board);
        }

    }
    
}