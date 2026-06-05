/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer>a=new ArrayList<>();
        while (head!=null) {
            a.add(head.val);
            head=head.next;
        }
        int n=a.size();
        int[] ans=new int[n];
        Stack<Integer>st=new Stack<>();
        for (int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=a.get(i))
                st.pop();
            ans[i]=st.isEmpty()?0:st.peek();
            st.push(a.get(i));
        }
        return ans;
    }
}