class solution{
    public void rotate(int[][] matrix){
        int n=matrix.length;
        for(int i=0;i<n;i++){
            int a=0;
            int b=n-1;
            while(a<=b){
                int temp=matrix[a][i];
                matrix[b][i]=temp;
                a++;
                b--;

            }
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp= matrix[i][j];
                matrix[j][i]=temp;

            }
        }
    }
}