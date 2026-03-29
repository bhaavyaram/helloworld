class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length()-1;
        int count = 0;
        while(i>=0 && i<s.length() && s.charAt(i)==' ')i--;
        while(i>=0 && i<s.length() && s.charAt(i)!=' ')
        {
            count++;
            i--;
        }
        return count;
    }
}