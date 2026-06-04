class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int prod=1,maxlen=0;
        if(k<=1) return 0;
        for(int l=0,r=0;r<arr.length;r++){
            prod=prod*arr[r];
            while(prod>=k){
                prod=prod/arr[l];
                l++;
            }
            maxlen=maxlen+r-l+1;
        }
        return maxlen;
    }
}