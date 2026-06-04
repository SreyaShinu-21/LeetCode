class Solution {
    public static boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public int maxVowels(String s, int k) {
        int max=0;
        int curr=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                curr++;
            }if(i>=k){
                if(isVowel(s.charAt(i-k))){
                    curr--;
                }
            }
            max=Math.max(max,curr);
        }
        return max;
    }
}