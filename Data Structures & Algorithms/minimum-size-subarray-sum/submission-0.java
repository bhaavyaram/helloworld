class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int mini = Integer.MAX_VALUE;
        int left = 0;
        for(int right = 0; right<nums.length; right++)
        {
            sum += nums[right];
            while(sum>=target && left<nums.length)
            {
                mini = Math.min(mini, right-left+1);
                sum -= nums[left];
                left++;
            }
        }
        if(mini==Integer.MAX_VALUE) return 0;
        return mini;
    }
}