class Solution {
    public int scoreOfString(String s) {
        int sum = 0;
        int n = s.length();
        for(int i=0;i<n-1;i++)
        {
            int ch1 = s.charAt(i);
            int ch2 = s.charAt(i+1);
            sum += Math.abs(ch1-ch2);
        }
        return sum;
    }
}