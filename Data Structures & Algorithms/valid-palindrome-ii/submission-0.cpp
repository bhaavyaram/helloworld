class Solution {
public:
    bool validPalindrome(string s) {
        string cleaned = "";
        for (char c : s) {
            if (isalnum(c)) {
                cleaned += tolower(c);
            }
        }
        return isValid(cleaned);
    }

private:
    bool isValid(string s) {
        int len = s.length();

        if (len <= 1) return true;
        if (s[0] == s[len - 1]) {
            // Characters match → recurse on middle
            return isValid(s.substr(1, len - 2));
        } else {
            // Try skipping either first or last character
            return isPalindrome(s.substr(1, len - 1)) || isPalindrome(s.substr(0, len - 1));
        }
    }

    bool isPalindrome(string s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s[l++] != s[r--])
                return false;
        }
        return true;
    }
};
