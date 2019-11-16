package MergeTwoSortedLists;

public class Solution {
    public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
    }
    /*Note this works for 2 arrays, but if we had K arrays,
    * we would have to use a min heap with access to
    * the iterator for each array.
    */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode head = temp;

        while(l1 !=null && l2 !=null){
            if(l1.val < l2.val){
                temp.next = l1;
                l1 = l1.next;
            } else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if(l1 != null){
            temp.next = l1;
        } else {
            temp.next = l2;
        }
        return  head.next;
    }
}
