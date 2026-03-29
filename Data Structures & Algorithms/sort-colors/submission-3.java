class Solution {
    public void sortColors(int[] nums) {
        int zero_count = 0;
        int one_count = 0;
        int two_count = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) zero_count++;
            else if(nums[i]==1) one_count++;
            else two_count++;
        }
        for(int i=0;i<zero_count;i++)
        {
            nums[i]=0;
        }
        for(int i=zero_count;i<zero_count+one_count;i++)
        {
            nums[i]=1;
        }
        for(int i=zero_count+one_count;i<nums.length;i++)
        {
            nums[i]=2;
        }
    }
}