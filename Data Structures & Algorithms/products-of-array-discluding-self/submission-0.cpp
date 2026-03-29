class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int>product;
        for(int i=0;i<nums.size();i++)
        {
            int prod =1;
            for(int j=0;j<nums.size();j++)
            {
                if(i==j) continue;
                prod = prod * nums[j];
            }
            product.push_back(prod);
        }
        return product;

    }
};
