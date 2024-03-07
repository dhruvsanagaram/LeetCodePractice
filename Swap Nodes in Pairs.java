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
    public ListNode swapPairs(ListNode head) {
        // ListNode temp = head;
        // boolean first_swap = true;
        // while(temp != null && temp.next != null){
        //     System.out.println("TEMP VAL: " + temp.val);
        //     System.out.println("TEMP NEXT VAL" + temp.next.val);

        //     ListNode second = new ListNode();
        //     second.next = temp.next; 
        //     ListNode top = new ListNode();
        //     top.next = temp;
        //     ListNode bottom = new ListNode();
        //     bottom.next = temp.next.next;

        //     temp.next.next = top;
        //     temp.next = bottom;


        //     second.next.next = top.next;
        //     temp.next = bottom.next;

        //     if(first_swap){
        //         head = second.next;
        //         first_swap = false;
        //     }
        //     second.next = null;
        //     top.next = null;
        //     bottom.next = null;

        //     temp = temp.next;
        // }
        // return head;
        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = null;
        ListNode temp = head;
        ListNode new_head = head.next;

        while(temp != null && temp.next != null){
            ListNode first = temp;
            ListNode second = temp.next;

            first.next = second.next;
            second.next = first;

            if(prev != null){
                prev.next = second;
            }

            prev = first;
            temp = first.next;

        }
        return new_head;
    }
}
