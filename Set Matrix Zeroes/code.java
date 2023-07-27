class Solution {
    public void setZeros(int[][] matrix){
        int rows=matrix.length;
        int col=matrix[0].length;
        boolean[] zeror=new boolean[rows];
        boolean[] zeroc=new boolean[col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeror[i] = true;
                    zeroc[j] = true;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (zeror[i] || zeroc[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
