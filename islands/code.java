class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int count=0;
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    count=count+1;
                    search(i,j,grid);
                }
            }
        }
        return count;
        
    }
    //dfs backtrackig algortihm
    private void search(int i,int j,char[][] grid){
        if(i<0||i>=grid.length||j<0||j>=grid[i].length||grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        search(i+1, j, grid);
        search(i-1, j, grid);
        search(i, j-1, grid);
        search(i, j+1, grid);
        


        

    }
}