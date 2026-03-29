class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        
        int left = 0;
        int right = 0;
        int n = word.length();
        int a = abbr.length();
        while(left<n && right<a)
        {
            if(Character.isLetter(abbr.charAt(right)))
            {
                if(word.charAt(left)==abbr.charAt(right))
                {
                    left++;
                    right++;
                }else{
                    return false;
                }
            }else{
                if(abbr.charAt(right)=='0') return false;
                int num=0;
                while(right<a && Character.isDigit(abbr.charAt(right)))
                {
                    num = num*10 + (abbr.charAt(right)-'0');
                    right++;
                }
                
                left+=num;
            }
            
        }
        return (left==n && right==a);
    }

}
