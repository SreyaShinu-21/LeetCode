class Solution {
    public String shortestPalindrome(String s) {
        String r=new StringBuilder(s).reverse().toString();
        String x=s+"#"+r;
        int[] lps=new int[x.length()];
        for (int i=1;i<x.length();i++){
            int j=lps[i-1];
            while(j>0 && x.charAt(i)!=x.charAt(j))
                j=lps[j-1];
            if (x.charAt(i)==x.charAt(j))
                j++;
            lps[i]=j;
        }
        int len=lps[x.length()-1];
        return r.substring(0,s.length()-len)+s;
    }
}