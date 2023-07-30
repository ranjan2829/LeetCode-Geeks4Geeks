class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int i,j,k=0;
        long[] array= new long[n+m];
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                array[k++]=arr1[i++];


                
            }
            else{
                array[k++]=arr2[j++];
            }
        }
        while(i<n){
            array[k++]=arr1[i++];
        } 
        while(j<n){
            array[k++]=arr2[j++];
        } 
        System.arraycopy(array, 0, arr1, 0, n);
        System.arraycopy(array, n, arr2, 0, m);

    }
}
