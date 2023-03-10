class Solution {
    public int findNumbers(int[] arr) {
        if(arr.length==0){
            return 0;
        }
        int index=0;

        int counter=0;
        for(int i=0;i<arr.length;i++){
            String element= Integer.toString(arr[i]);
            int size=element.length();
            if(size%2==0){
                counter++;

            }

        }
        return counter;

        
    }
}
