class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int arr[][]=new int[m+1][n+1];
        for(String s:strs){
            int zero=0;
            int one=0;
            for(int c:s.toCharArray()){
                if(c=='0')
                    zero++;
                else
                    one++;
            }
            for(int i=m;i>=zero;i--){
                for(int j=n;j>=one;j--){
                    arr[i][j]=Math.max(arr[i][j],arr[i-zero][j-one]+1);
                }
            }
        }
        return arr[m][n];
    }
}