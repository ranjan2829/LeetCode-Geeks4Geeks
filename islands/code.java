class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int count=0;
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1' && search()){
                    count=count+1;
                }
            }
        }
        return count;
        
    }
    private boolean search(int i,int j, int idx, char[][] grid){
        
    }
}