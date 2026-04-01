class Solution {
    public int findLucky(int[] arr) {
        int []res = new int [500];
        int result = -1;
        for(int i=0;i<arr.length;i++)
        {
            res[arr[i]]++;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(res[arr[i]] == arr[i]) result = Math.max(arr[i],result);
        }
        return result;
    }
}