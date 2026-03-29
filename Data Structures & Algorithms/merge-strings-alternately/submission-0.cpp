class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        int size = min(word1.length(),word2.length());
        {
            string s="";
            for(int i=0;i<size;i++)
            {
                s=s+word1[i]+word2[i];
            }
            if(word1.length()>word2.length())
            {
                for(int i=size;i<word1.length();i++)
                {
                    s+=word1[i];
                }
            }
            else
            {
                for(int i=size;i<word2.length();i++)
                {
                    s+=word2[i];
                }
            }
            return s;
        }
    }
};