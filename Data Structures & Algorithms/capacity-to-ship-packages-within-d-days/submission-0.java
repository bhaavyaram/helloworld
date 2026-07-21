class Solution {

    public static int day(int[]weights,int capacity)
    {
        int load = 0;
        int day = 1;
        for(int w : weights)
        {
            if(load + w <= capacity)
            {
                load += w;
            }else
            {
                day++;
                load = w;
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int totalsum = 0;
        for(int w: weights) totalsum +=w;
        int low = 0;
        for(int w : weights)
        {
       low = Math.max(low, w);
        }
        int high = totalsum;
        int result = high;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(day(weights,mid) > days)
            {
                low = mid+1;
            }else{
                result = mid;
                high = mid-1;
            }

        }
        return result;
    }
}