class Solution {

    public static int time(int[]piles, int hours, int banana)
    {
        int time = 0;
        for(int pile: piles)
        {
            time += (pile%banana)==0 ? pile/banana : (pile/banana)+1;
        }
        return time;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int maxNum = -1;
        for(int num: piles) maxNum = Math.max(maxNum, num);
        int low = 1;
        int high = maxNum;
        int result = maxNum;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(time(piles,h,mid) > h)
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
