class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.length() != t.length())
            return false;
        int list_s[26]={0}, list_t[26]={0};
        for(char c: s)
        {
            list_s[c-'a']++;
        }
        for(char c: t)
        {
            list_t[c-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(list_s[i]!=list_t[i]) return false;
        }
        return true;
        
    }
};
