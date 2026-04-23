class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        String result="";
        for(String w:words){
            for(int i=w.length()-1;i>=0;i--){
                result+=w.charAt(i);
            }
            result+=" ";
        }
        return result.trim();
    }
}