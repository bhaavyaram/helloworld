class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int size = n-1;
        int arr[] = new int[n];
        while(left<=right)
        {
            if(Math.abs(nums[left])>Math.abs(nums[right]))
            {
                arr[size]=(nums[left]*nums[left]);
                left++;
            }else
            {
                arr[size] = (nums[right]*nums[right]);
                right--;
            }
            size--;
        }
        return arr;
    }
}