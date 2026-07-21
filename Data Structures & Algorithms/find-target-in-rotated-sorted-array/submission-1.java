class Solution {

    public static int findPivot(int[]arr)
    {
        int low = 0; 
        int high = arr.length - 1;
        while(low<high)
        {
            int mid = (low+high)/2;
            if(arr[mid]>arr[high])
            {
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return high;

    }

    public static int findTarget(int low, int high, int[]arr, int target)
    {
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
    public int search(int[] arr, int target) {
        int pivotIndex = findPivot(arr);
        int firstHalf = findTarget(0,pivotIndex-1,arr,target);
        int  secondHalf = findTarget(pivotIndex, arr.length-1, arr, target);
        return(firstHalf==-1 ? secondHalf:firstHalf);
    }
}