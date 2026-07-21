class Solution {
    public static int findLeftMost(int[] arr, int tgt)
    {
        int left = 0;
        int right = arr.length -1;
        int ans = -1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(arr[mid]==tgt)
            {
                ans = mid;
                right = mid-1;
            }else if(arr[mid]> tgt)
            {
                right = mid -1;
            }else{
                left = mid+1;
            }
        }
        return ans;

    }

    public static int findRightMost(int[] arr, int tgt)
    {
        int left = 0;
        int right = arr.length -1;
        int ans = -1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(arr[mid]==tgt)
            {
                ans = mid;
                left = mid+1;
            }else if(arr[mid]> tgt)
            {
                right = mid -1;
            }else{
                left = mid+1;
            }
        }
        return ans;

    }

    public int[] searchRange(int[] nums, int target) {
        int leftmost = findLeftMost(nums,target);
        int rightmost = findRightMost(nums,target);
        return new int[]{leftmost, rightmost};
    }
}