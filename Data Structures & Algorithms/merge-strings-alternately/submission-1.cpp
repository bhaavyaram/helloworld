class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        int left = 0;
        int right = 0;
        string s="";
        while(left<word1.length() || right<word2.length())
        {
            if(left<word1.length())
            {
                s+=word1[left];
                left++;
            }
            if(right<word2.length())
            {
                s+=word2[right];
                right++;
            }
        }
        return s;

    }
};