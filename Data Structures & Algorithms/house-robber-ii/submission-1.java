class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int dp_first[] = new int[nums.length];
        int dp_second [] = new int[nums.length];
        Arrays.fill(dp_first,-1);
        Arrays.fill(dp_second,-1);

        return Math.max(solve_first(nums,dp_first,0),solve_second(nums,dp_second,1));
    }
    public int solve_first(int []nums, int []dp, int idx)
    {
        if(idx>=nums.length-1) return 0;
        if(dp[idx] != -1) return dp[idx];
        int take = nums[idx] + solve_first(nums,dp,idx+2);
        int not_take = solve_first(nums,dp,idx+1);
        return dp[idx] = Math.max(take,not_take);
    }
    public int solve_second(int []nums, int []dp, int idx)
    {
        if(idx>=nums.length) return 0;
        if(dp[idx] != -1) return dp[idx];
        int take = nums[idx] + solve_second(nums,dp,idx+2);
        int not_take = solve_second(nums,dp,idx+1);
        return dp[idx] = Math.max(take,not_take);
    
    }
}
