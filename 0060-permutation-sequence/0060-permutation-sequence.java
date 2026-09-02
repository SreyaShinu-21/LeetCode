class Solution {
    public String getPermutation(int n, int k) {
        String s="";
        for (int i=1;i<=n; i++)
            s += i;
        for (int i = 1; i < k; i++)
            s = next(s);
        return s;
    }
    String next(String s) {
        char[] a = s.toCharArray();
        int i = a.length - 2;
        while (a[i] > a[i + 1])
            i--;
        int j = a.length - 1;
        while (a[j] < a[i])
            j--;
        char t = a[i];
        a[i] = a[j];
        a[j] = t;
        for (i++, j = a.length - 1; i < j; i++, j--) {
            t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
        return new String(a);
    }
}