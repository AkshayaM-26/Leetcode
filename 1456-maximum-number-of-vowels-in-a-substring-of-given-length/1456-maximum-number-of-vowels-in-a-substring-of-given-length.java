class Solution {
    public boolean isVow(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'; 
    }
    public int maxVowels(String s, int k) {
        int max=0,cur=0;
        for(int i=0;i<s.length();i++){
            if(isVow(s.charAt(i))){
                cur++;
            }
            if(i>=k){
                if(isVow(s.charAt(i-k))){
                    cur--;
                }
            }
            max=Math.max(cur,max);
        }
        return max;
    }
}