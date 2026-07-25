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
        int rightprod = 1;
        for(int i=n-1; i>=0; i--)
        {
            leftprod[i] = leftprod[i]*rightprod;
            rightprod *=nums[i];
        }  
        return leftprod;
    }
}  
