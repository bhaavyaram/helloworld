class Solution {
    public int[] countBits(int n) {
        int num = 0;
        int count = 0;
        int output[] = new int[n+1];
        while(num<=n)
        {
            if(num==0)output[0] = 0;
            else
            {
                count = 0;
                int temp = num;
                while(temp>0)
                {
                    temp = temp &(temp-1);
                    count++;
                }    
                output[num] = count;
            }
            num++;
            
        }
        return output;
    }
}
