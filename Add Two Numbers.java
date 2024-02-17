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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1_length = 0;
        int l2_length = 0;
        ListNode l1_temp = l1;
        ListNode l2_temp = l2;
        while(l1_temp != null){
            l1_length++;
            l1_temp = l1_temp.next;
        }
        while(l2_temp != null){
            l2_length++;
            l2_temp = l2_temp.next;
        }
        
        int diff = l1_length - l2_length;
        ListNode temp = null;
        ListNode other = null;
        if(diff >= 0){
            temp = l1;
            other = l2;
        }
        else if(diff < 0){
            temp = l2;
            other = l1;
        }

        diff = Math.abs(diff);
        String res = "";
        while(diff != 0){
            temp = temp.next;
            diff--;
            res += Integer.toString(temp.val);
        }

        while(temp != null){
            res += Integer.toString(temp.val + other.val);
            temp = temp.next;
            other = other.next;
        }

        ListNode out = new ListNode(String.parseInt(res));
        return out;
    }
}