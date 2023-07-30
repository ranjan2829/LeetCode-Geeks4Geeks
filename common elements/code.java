class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    
    {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                for(int k=0;k<n3;k++){
                    if(A[i]==B[j] && B[j] ==C[k]){
                        ans.add(A[i]);
                    }
                    
                }
            }
        }
        return ans;
        // code here 
    }
}
