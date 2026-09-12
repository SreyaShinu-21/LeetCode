class Solution {
    public int findKthPositive(int[] arr, int k) {
        int x=1;
        for(int n:arr){
            while(x<n){
                k--;
                if(k==0)
                    return x;
                x++;
            }
            x++;
        }
        return x+k-1;
    }
}