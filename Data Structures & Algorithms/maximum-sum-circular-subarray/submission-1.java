class Solution {

    public int maxSubarraySumCircular(int[] nums) {
        //lets consider that the maxsum lies in the circular part (array ke end se array ke start tak)
        //then it is a fact that the remaining portion of the array is the minimum sum subarray
        //if u simply subtract the minimum sum from the total sum of the array, u can find the maxsum.

        //but if maxsum lies in the array normally, find maxsum using just kadane
        //find the max of maxsum and total-minsum. return whichever is max only if>0

        int totalsum = 0;
        for(int i=0; i<nums.length; i++)
        {
            totalsum += nums[i];
        }
        int currsum_min = nums[0];
        int minsum = nums[0];
        int maxsum = nums[0];
        int currsum_max = nums[0];
        for(int i=1; i<nums.length; i++)
        {
            currsum_min = Math.min(currsum_min+nums[i], nums[i]);
            minsum = Math.min(minsum, currsum_min);
            currsum_max = Math.max(currsum_max+nums[i], nums[i]);
            maxsum = Math.max(maxsum, currsum_max);
        }
        int circular_sum = totalsum - minsum;
        return circular_sum>0 ? Math.max(circular_sum, maxsum) : maxsum;


    }
}