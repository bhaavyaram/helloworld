class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length == 1) return true;
        boolean odd= false;
        boolean even = false;;
        for(int i=0; i<nums.length-1; i++)
        {
            odd = false;
            even = false;
            if(nums[i]%2==0 && nums[i+1]%2==1 || nums[i]%2==1 && nums[i+1]%2==0)
            {
                odd= true;
                even = true;
            }else return false;
        }
        return (odd==true && even == true);
    }
}