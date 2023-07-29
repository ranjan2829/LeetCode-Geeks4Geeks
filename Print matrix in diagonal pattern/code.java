class Solution {
    public int[] matrixDiagonally(int[][] mat) {
        int n = mat.length;
        int[] ans = new int[n * n]; // Initialize the answer array with the correct size

        int idx = 0; // Index to track the position in the ans array

        // Loop through the diagonals
        for (int k = 0; k < 2 * n - 1; k++) {
            // For even diagonals
            if (k % 2 == 0) {
                // Loop through the elements in the diagonal
                for (int i = Math.min(k, n - 1); i >= 0 && k - i < n; i--) {
                    int j = k - i;

                    ans[idx] = mat[i][j];
                    idx++;
                }
            } else { // For odd diagonals
                // Loop through the elements in the diagonal
                for (int i = Math.min(k, n - 1); i >= 0 && k - i < n; i--) {
                    int j = k - i;

                    ans[idx] = mat[j][i];
                    idx++;
                }
            }
        }

        return ans;
    }
}