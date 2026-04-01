class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set = new TreeSet<>();
        if(nums.length == 0) return 0;
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        int count = 1;
        int longest = 1;
        for(int num : set)
        {
            if(set.contains(num+1))
            {
                count++;
                longest = Math.max(longest,count);
            }
            else count = 1;
        }
        return longest;
    }
}
