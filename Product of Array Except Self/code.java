class Solution {
    public int[] productExceptSelf(int[] nums) {
        int nz=0;//number of zeros
        int prod=1;//product
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
                nz++;
            else
                prod=prod*nums[i];
        }
        for(int i=0;i<n;i++)
        {
            if(nz==1)
            {
                if(nums[i]==0)
                    ans[i]=prod;
                else
                    ans[i]=0;
            }
            if(nz==0)
                ans[i]=prod/nums[i];
        }
        return ans;
    }
}