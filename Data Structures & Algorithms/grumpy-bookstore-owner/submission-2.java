class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int sum=0,result=0,maxx=0;
        int n = customers.length;
        for(int i=0;i<n;i++)
        {
            if(grumpy[i]==0) result+=customers[i];
        }
        for(int i=0;i<minutes;i++)
        {
            if(grumpy[i]==1) sum+=customers[i];
        }
        maxx=sum;
        for(int i=minutes;i<n;i++)
        {
            if(grumpy[i]==1) sum+=customers[i];
            if(grumpy[i-minutes]==1) sum-=customers[i-minutes];
            maxx = Math.max(maxx,sum);
        }
        return result+maxx;
    }
}