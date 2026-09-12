class Solution {
    public String reverseOnlyLetters(String s) {
        char[] a=s.toCharArray();
        int i=0,j=a.length-1;
        while(i<j){
            if(!Character.isLetter(a[i])) 
                i++;
            else if(!Character.isLetter(a[j])) 
                j--;
            else{
                char t=a[i];
                a[i]=a[j];
                a[j]=t;
                i++;
                j--;
            }
        }
        return new String(a);
    }
}