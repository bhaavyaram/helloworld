class Solution {
public:
    bool isPalindrome(string s)
    {
        string cleaned = "";
        for(char c : s)
        {
            if(isalnum(c))
        {
            cleaned+=tolower(c);
        }
        }
        return checkPalindrome(cleaned);
    }
    private:
    bool checkPalindrome(string s) {

        int size = s.length();
        if(size<=1)
        {
            return true;
        }
        if(s[0]!=s[size-1])
        {
            return false;
        }
        return checkPalindrome(s.substr(1,size-2));
        
    }

};

