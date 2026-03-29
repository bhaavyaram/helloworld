class Solution {
    public String mergeAlternately(String word1, String word2) {
        int left = 0;
        int right = 0;
        StringBuilder result = new StringBuilder();
        while(left<word1.length() && right<word2.length())
        {
            result.append(word1.charAt(left));
            result.append(word2.charAt(right));
            left++;
            right++;
        }
        while(left<word1.length())
        {
            result.append(word1.charAt(left));
            left++;
        }while(right<word2.length()){
            result.append(word2.charAt(right));
            right++;
        }
        return result.toString();
    }
    
}