class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = 0;
        int max = k;
        int min_diff = nums[nums.length-1]-nums[0];
        for(int i=k-1;i<nums.length;i++)
        {
            min_diff = Math.min(min_diff,nums[i]-nums[i-k+1]);
        }
        return min_diff;
        
    }
}