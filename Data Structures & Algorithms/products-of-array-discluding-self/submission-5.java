class Solution {
    public int[] productExceptSelf(int[] nums) {
        //O(N) time without division but extra space.
        int n = nums.length;
        int[]leftprod = new int[n];
        leftprod[0] = 1;
        for(int i=1; i<n; i++)
        {
            leftprod[i] = leftprod[i-1]*nums[i-1];
        }
        int[]rightprod = new int[n];
        rightprod[n-1] = 1;
        for(int i=n-2; i>=0; i--)
        {
            rightprod[i] = rightprod[i+1]*nums[i+1];
        }
        int[]result = new int[n];
        for(int i=0; i<n; i++)
        {
            result[i] = leftprod[i]*rightprod[i];
        }
        return result;
    }
}  
