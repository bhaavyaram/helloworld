class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        int left = 0;
        int count = 0;
        for(int right = 0; right<s.length(); right++)
        {
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()<right-left+1)
            {
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0) map.remove(s.charAt(left));
                left++;
            }
            count = Math.max(count, right-left+1);
        }
        return count;
    }
}
