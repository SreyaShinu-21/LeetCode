class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] a=new int[t.length];
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<t.length;i++){
            while(!s.empty()&&t[i]>t[s.peek()])
                a[s.peek()]=i-s.pop();
            s.push(i);
        }
        return a;
    }
}