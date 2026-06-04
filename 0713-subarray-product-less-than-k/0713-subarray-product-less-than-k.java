class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int prod=1,maxlen=0,ws=0;
        if(k<=1) return 0;
        for(int we=0;we<arr.length;we++){
            prod=prod*arr[we];
            while(prod>=k){
                prod=prod/arr[ws];
                ws++;
            }
            maxlen=maxlen+we-ws+1;
        }
        return maxlen;
    }
}