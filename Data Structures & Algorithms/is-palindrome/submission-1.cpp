class Solution {
public:
    bool isPalindrome(string s) {
        string str = "";
        for(char c:s)
        {
            if(isalnum(c))
            {
                str+=tolower(c);
            }
        }
        int left=0, right = str.length()-1;
        while(left<right)
        {
            if(str[left]==str[right])
            {
                left++;
                right--;
            }else
            {
                return false;
            }
        }
        return true;
    }
};
