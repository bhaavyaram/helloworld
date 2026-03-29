class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n = nums.size()/2;
        sort(nums.begin(),nums.end());
        return nums[n];

        }
       
};
// class Solution {
// public:
//     int majorityElement(vector<int>& nums) {
//         int n = nums.size() / 2;

//         for (int i = 0; i < nums.size(); i++) {
//             int count = 1;

//             for (int j = i + 1; j < nums.size(); j++) {
//                 if (nums[i] == nums[j]) {
//                     count++;
//                 }
//             }

//             if (count > n) {
//                 return nums[i];
//             }
//         }

//         return -1; 
//     }
// };