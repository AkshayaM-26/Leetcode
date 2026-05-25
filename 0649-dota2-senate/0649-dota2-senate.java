class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer>radian=new LinkedList<>();
        Queue<Integer>dire=new LinkedList<>();
        int n=senate.length();
        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='R'){
                radian.offer(i);
            }
            else{
                dire.offer(i);
            }
        }
        while(!radian.isEmpty() && !dire.isEmpty()){
            int r=radian.poll();
            int d=dire.poll();
            if(r<d){
                radian.offer(r+n);
            }
            else{
                dire.offer(d+n);
            }
        }
        return radian.isEmpty()?"Dire":"Radiant";
    }
}