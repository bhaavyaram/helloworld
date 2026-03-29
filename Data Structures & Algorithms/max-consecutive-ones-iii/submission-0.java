class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int left = 0;
        int zero = 0;
        for(int right = 0;right<n;right++)
        {
            if(nums[right]==0) zero++;
            while(zero>k)
            {
                if(nums[left]==0)zero--;
                left++;
            }
            count = Math.max(count, right-left+1);
        }
        return count;
    }
}