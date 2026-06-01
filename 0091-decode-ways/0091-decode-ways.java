class Solution {
    public int numDecodings(String s) {
        int p2=1;
        int p1=s.charAt(0)=='0' ? 0 : 1;
        for(int i=2;i<=s.length();i++){
            int c=0;
            if(s.charAt(i-1)!='0'){
                c+=p1;
            }
            int two=(s.charAt(i-2)-'0')*10+(s.charAt(i-1)-'0');
            if (two>=10&&two<=26){
                c+=p2;
            }
            p2=p1;
            p1=c;
        }
        return p1;
    }
}
