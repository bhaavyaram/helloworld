class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k==0)return;
        k=k%n;
        rev(0,n-1,nums);
        rev(0,k-1,nums);
        rev(k,n-1,nums);
        return;
    }

    


    public void rev(int start, int end, int[] nums)
    {
        while(start<=end)
        {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}