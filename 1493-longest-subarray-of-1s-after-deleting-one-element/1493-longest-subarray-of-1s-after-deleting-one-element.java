class Solution {
    public int longestSubarray(int[] nums) {
        int zcount=0,w=0,s=0;
        for(int i=0;i<nums.length;i++){
            zcount+=(nums[i]==0?1:0);
            while(zcount>1){
                zcount-=(nums[s]==0?1:0);
                s++;
            }
            w=Math.max(w,i-s);
        }
        return w;
    }
}