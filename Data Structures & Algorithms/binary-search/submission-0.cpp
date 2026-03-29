class Solution {
public:
    int binsearch(vector<int>&nums, int low, int high, int tgt)
    {
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(nums[mid]==tgt) return mid;
            else if(nums[mid]>tgt)
            {
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
    int search(vector<int>& nums, int target) {
        int n = nums.size();
        int low = 0, high = n-1;
        return binsearch(nums,low,high,target);
    }
};
