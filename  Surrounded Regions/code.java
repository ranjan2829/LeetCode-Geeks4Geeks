class Solution {
    public void solve(char[][] board) {
        int row=board.length;
        int col=board[0].length;
        boolean visited[][] = new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='O' && searchdfs(i,j,idx,board)){
                    board[i][j]='X';

                }
            }
        }
        
    }
    private boolean searchdfs(int i, int j , int idx, char[][] board){
        if(i<0||i>=board.length||j<0||j>=board[i].length||visited[i][j]){
            return false;
        }
        visited[i][j]=true;
        if(searchdfs(i+1, j, idx, board)||
           searchdfs(i-1, j, idx, board)||
           searchdfs(i, j+1, idx, board)||
           searchdfs(i, j-1, idx, board))
        {
            return true;
        }
        return false;
    }
    
}