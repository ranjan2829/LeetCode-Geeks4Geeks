class Solution {
    public int missingNumber(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[correct]!=arr[i]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
            




        }
        for(int j=0;j<arr.length;j++){
            if (arr[j]!=j){
                return j;
                
            }
            
        }
        return arr.length;
        
    }
    static void swap(int[] arr,int num1,int num2){
        int temp=arr[num1];
        arr[num1]=arr[num2];
        arr[num2]=temp;

    }
 
        
    
}