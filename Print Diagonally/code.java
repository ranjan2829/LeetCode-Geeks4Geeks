
class Solution{

    static ArrayList<Integer> downwardDiagonal(int N, int A[][])

    {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int k=0;i<2*N;k++){
            int i=0;
            while(i<=k){
                int j=k-1;
                if(i<N && j<N){
                    ans.add(A[i][j]);
                }
                i++;

            }

        }
        return ans;
    }
}