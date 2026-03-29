class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxcount = 0;
        int count = 0;
        for(int right = 0; right<nums.length; right++)
        {
            if(nums[right]==1)
            {
                count++;
                maxcount = Math.max(maxcount,count);
            }
            else count = 0;
            
        }
        return maxcount;
    }
}