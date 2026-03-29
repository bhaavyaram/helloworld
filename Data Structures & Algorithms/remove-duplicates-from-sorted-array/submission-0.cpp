class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int left=0;
        int right=1;
    vector<int>unique;
    unique.push_back(nums[left]);
        while(right<nums.size())
        {
            if(nums[left]!=nums[right])
            {
                unique.push_back(nums[right]);
                left=right;
            }
            right++;
            
        }
        nums=unique;
        return unique.size();
    }
};