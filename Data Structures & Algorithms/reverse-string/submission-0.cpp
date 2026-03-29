class Solution {
public:
    void reverseString(vector<char>& s) {
        vector<char>rev;
        for(int i=s.size()-1;i>=0;i--)
        {
            rev.push_back(s[i]);
        }
        s= rev;

    }
};