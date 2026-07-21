class Solution {
    public static int minInRotated(int[] arr)
    {
        int left = 0;
        int right = arr.length - 1;
        int mini = Integer.MAX_VALUE;
        while(left<right)
        {
            int mid = (left+right)/2;
            if(arr[mid]>arr[right])
            {
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return arr[right];
    }

    public int findMin(int[] nums) {
        return minInRotated(nums);
    }
}
