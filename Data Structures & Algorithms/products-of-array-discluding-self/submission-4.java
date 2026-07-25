class Solution {
    public int[] productExceptSelf(int[] nums) {
        //O(N) with division
        int prod_all = 1;
        int prodwo_zero = 1;
        int zerocount = 0;
        int n = nums.length;
        for(int i=0; i<n; i++)
        {
            prod_all *= nums[i];
            if(nums[i] == 0)
            {
                zerocount++;
                continue;
            }
            prodwo_zero *=nums[i];
        }
        int[]result = new int[n];
        for(int i=0; i<n; i++)
        {
            if(nums[i]!=0)
            {
                result[i] = prod_all/nums[i];
            }else{
                if(zerocount>1) result[i] = 0;
                else result[i] = prodwo_zero;
            }
        }
        return result;
        
    }
}  
