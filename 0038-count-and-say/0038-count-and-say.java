class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int i=1;i<n;i++){
            String t="";
            int count=1;
            for(int j=1;j<s.length();j++){
                if(s.charAt(j)==s.charAt(j-1)){
                    count++;
                }else{
                    t+=count+""+s.charAt(j-1);
                    count=1;
                }
            }
            t+=count+""+s.charAt(s.length()-1);
            s=t;
        }
        return s;
    }
}