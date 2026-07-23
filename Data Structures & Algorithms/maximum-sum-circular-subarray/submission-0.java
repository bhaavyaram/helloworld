class Solution {

    public void reverse(int nums[],int start, int k)
    {
        int left = start;
        int right = k;
        while(left<=right)
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public int[] rotate(int []nums, int k)
    {
        int n = nums.length;
        k = k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        return nums;
    } 
    public int kadane(int[]nums)
    {
        int currsum = nums[0];
        int maxi = nums[0];
        for(int i=1; i<nums.length; i++)
        {
            currsum = Math.max(currsum+nums[i], nums[i]);
            maxi = Math.max(maxi,currsum);
        }
        return maxi;
    }
    public int maxSubarraySumCircular(int[] nums) {
         
        int maxsum = nums[0];
        int n = nums.length;
        for(int i=0; i<n; i++)
        {
            int arr[] = rotate(nums,i);
            int sum = kadane(arr);
            maxsum = Math.max(maxsum, sum);
        }
        return maxsum;
    }
}