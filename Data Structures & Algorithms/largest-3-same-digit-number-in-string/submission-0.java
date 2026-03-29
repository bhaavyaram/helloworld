class Solution {
    public String largestGoodInteger(String num) {
        int maxint = Integer.MIN_VALUE;
        for(int i=0;i<num.length()-2; i++)
        {
            char ch = num.charAt(i);
            if(ch == num.charAt(i+1) && ch == num.charAt(i+2))
            {
                maxint = Math.max(maxint, ch-'0');
            }
        }
        if(maxint==Integer.MIN_VALUE) return "";
        else{
            String result = ""+maxint+maxint+maxint;
            return result;
        }
    }
}