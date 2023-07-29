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
                if(board[i][j]=='O' && boundarydfs(i,j,board)){
                    board[i][j]='X';

                }
            }
        }
        
    }
    private boolean boundarydfs(int i, int j , char[][] board){
        if(i<0||i>=board.length||j<0||j>=board[i].length||visited[i][j]){
            return false;
        }
        visited[i][j]=true;
        if(boundarydfs(i+1, j, board)||
           boundarydfs(i-1, j, board)||
           boundarydfs(i, j+1, board)||
           boundarydfs(i, j-1, board))
        {
            return true;
        }
        return false;
    }
    
}