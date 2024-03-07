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
    public int getDecimalValue(ListNode head) {
        String s = "";
        ListNode temp = head;
        while(temp != null){
            s += temp.val;
            temp = temp.next;
        }

        int res = 0;
        int multiplier = 1;
        for(int i = s.length() - 1; i >= 0; i--){
            res += (Integer.parseInt("" + s.charAt(i))) * multiplier;
            multiplier *= 2;
        }
        return res;
    }
}