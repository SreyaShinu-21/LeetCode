class Solution {
    public int numDistinct(String s, String t) {
        int arr[]=new int[t.length()+1];
        arr[0]=1;
        for(int i=0;i<s.length();i++){
            for(int j=t.length()-1;j>=0;j--){
                if(s.charAt(i)==t.charAt(j)){
                    arr[j+1]=arr[j+1]+arr[j];
                }
            }
        }
        return arr[t.length()];
    }
}