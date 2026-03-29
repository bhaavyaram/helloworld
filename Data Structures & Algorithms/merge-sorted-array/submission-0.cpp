class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int left=0;
        int right=0;
        vector<int>merged;

        while(left<m || right<n)
        {
            if(left>=m && right<n)
            {
                merged.push_back(nums2[right]);
                right++;
            }
            else if(left<m && right>=n)
            {
                merged.push_back(nums1[left]);
                left++;
            }
            else{
            if(nums1[left]<nums2[right])
            {
                merged.push_back(nums1[left]);
                left++;
            }else
            {
                merged.push_back(nums2[right]);
                right++;
            }
            }

        }
        nums1 = merged;
    }
};