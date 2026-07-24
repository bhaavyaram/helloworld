class Solution {
    public int[] getLeftmax(int[]height, int n)
    {
        int[]leftmax = new int[n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++)
        {
            leftmax[i] = Math.max(leftmax[i-1],height[i]);
        }
        return leftmax;
    }
    public int[] getRightmax(int[]height, int n)
    {
        int[]rightmax = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--)
        {
            rightmax[i] = Math.max(rightmax[i+1],height[i]);
        }
        return rightmax;
    }
    
    public int trap(int[] height) {
        int n = height.length;
        int[]leftmax = getLeftmax(height,n);
        int[]rightmax = getRightmax(height,n);
        int sum = 0;
        for(int i=0; i<n; i++)
        {
            int water = Math.min(leftmax[i], rightmax[i]) - height[i];
            sum += water;
        }
        return sum;
    }
}
