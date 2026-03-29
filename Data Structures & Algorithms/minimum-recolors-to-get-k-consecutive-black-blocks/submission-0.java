class Solution {
    public int minimumRecolors(String blocks, int k) {
        int mini = Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<k;i++)
        {
            if(blocks.charAt(i)=='W') count++;
        }
        mini = Math.min(mini,count);
        for(int i=k;i<blocks.length();i++)
        {
            if(blocks.charAt(i)=='W') count++;
            if(blocks.charAt(i-k)=='W') count--;
            mini = Math.min(mini,count);
        }
        return mini;
    }
}