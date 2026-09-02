class Solution {
    public String getPermutation(int n, int k) {
        String s = "";
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        for (int i = 1; i < k; i++) {
            s = next(s);
        }
        return s;
    }
    String next(String s){
        char[] a=s.toCharArray();
        int i=a.length-2;
        while (i>=0 && a[i]>=a[i+1]){
            i--;
        }
        int j=a.length-1;
        while(a[j]<=a[i]){
            j--;
        }
        char temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        i++;
        j=a.length-1;
        while(i<j){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        return new String(a);
    }
}