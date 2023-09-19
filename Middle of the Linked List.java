//2/23/23 - Middle of the Linked List - Linked List - Easy
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = (fast.next).next;
        }
        return slow;
    }
}

