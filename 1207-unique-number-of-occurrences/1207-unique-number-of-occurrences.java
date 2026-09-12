class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] count=new int[2001];
        for(int x:arr)
            count[x+1000]++;
        for(int i=0;i<2001;i++){
            if(count[i]==0) 
                continue;
            for(int j=i+1;j<2001;j++){
                if(count[j]==count[i])
                    return false;
            }
        }
        return true;
    }
}