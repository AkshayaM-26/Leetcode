class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        int p1=2,p2=1,c=0;
        for(int i=3;i<=n;i++){
            c=p1+p2;
            p2=p1;
            p1=c;
        }
        return c;
    }
}