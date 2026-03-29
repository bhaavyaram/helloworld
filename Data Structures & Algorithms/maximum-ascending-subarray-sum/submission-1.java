class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        int left = 0;
        int right = 0;
        while(left<=right && left<nums.length && right<nums.length)
        {
            sum+=nums[right];
            right++;
            if(right<nums.length && nums[right]<=nums[right-1])
            {
                maxsum = Math.max(maxsum, sum);
                sum = 0;
                left = right;
            }
            maxsum = Math.max(maxsum,sum);
        }
        return maxsum;
    }
}