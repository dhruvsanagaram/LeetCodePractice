//2/2/23 - Remove Duplicates - LinkedList - Easy
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer, Integer> freq= new HashMap<Integer, Integer>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode bef = dummy;
        ListNode cur = head;
        while(cur != null){
            Integer count = freq.get(cur.val);

            if(count == null){
                freq.put(cur.val, 1);
                bef = bef.next;
            } 
            else{
                bef.next = cur.next;
            }
            cur = cur.next;
        }
        return head;
    }
}

