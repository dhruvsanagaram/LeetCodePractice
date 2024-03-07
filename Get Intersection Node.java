/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode, Boolean> myList = new HashMap<>();
        ListNode temp = headA;
        while(temp != null){
            myList.put(temp, true);
            temp = temp.next;
        }

        ListNode temp_b = headB;
        while(temp_b != null){
            if(myList.containsKey(temp_b)){
                return temp_b;
            }
            temp_b = temp_b.next;
        }

        return null;

    }
}
