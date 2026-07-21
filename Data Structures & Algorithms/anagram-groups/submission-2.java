class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //without sorting
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str: strs)
        {
            int[] arr = new int[26];
            for(char ch: str.toCharArray())
            {
                arr[ch-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int num: arr) sb.append(num).append('.');
            String key = sb.toString();
            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
