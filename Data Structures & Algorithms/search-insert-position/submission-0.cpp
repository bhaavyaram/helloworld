class Solution {
public:
    int binsearch(vector<int>&nums, int low, int high, int tgt)
    {
        int ans=nums.size();
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(nums[mid]==tgt) return mid;
            else if(nums[mid]>tgt)
            {
                ans = mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    int searchInsert(vector<int>& nums, int target) {
        int n = nums.size();
        int low = 0, high = n-1;
        return binsearch(nums,low,high,target);
    }
};