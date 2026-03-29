class Solution {
public:
    long long int binsearch(int x, int high, int low)
    {
        while(high>=low)
        {
            int mid = (low+high)/2;
            if(1LL*mid*mid==x) return mid;
            else if(1LL*mid*mid < x)
            {
                low=mid+1;
            }else{
                high = mid-1;
            }
        }
        return high;
    }
    long long int mySqrt(int x) {
        int high = x, low = 0;
        return binsearch(x,high,low);
    }
};