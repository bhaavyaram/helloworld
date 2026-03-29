class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element=0;
        for(int i=0; i<nums.length ; i++)
        {
            if(count == 0)
            {
                element = nums[i];
                count = 1;
            }
            if(element!=nums[i])
            {
                count --;
            }else{
                count++;
            }
        }
        int el_count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==element) el_count++;
        }
        if(el_count>nums.length/2) return element;
        else return -1;
    }
}