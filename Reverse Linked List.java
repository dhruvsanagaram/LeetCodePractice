//8/8/23 - Reverse Linked List - Linked List - Easy
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        var current = head;
        while(current != null){
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }
}

