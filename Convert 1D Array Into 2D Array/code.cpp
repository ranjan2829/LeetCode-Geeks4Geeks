class Solution {
public:
    vector<vector<int>> construct2DArray(vector<int>& nums, int n, int m) 
    {
        if(n*m!=nums.size())
        {
            return {};
        }
        int curr=0;
        vector<vector<int>>v(n,vector<int>(m,0));
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                v[i][j]=nums[curr++];
            }
        }
        return v;
    }
};