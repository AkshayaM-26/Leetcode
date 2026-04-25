class Solution {
    public boolean isPalindrome(String s) {
        String word="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                word=word+Character.toLowerCase(ch);
            }
        }
        String w="";
        for(int i=word.length()-1;i>=0;i--){
            w=w+word.charAt(i);
        }
        return w.equals(word);
    }
}