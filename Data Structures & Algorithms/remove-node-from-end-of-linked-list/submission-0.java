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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode curr = head;

        int size =0;
        while(curr!=null){
            curr = curr.next;
            size++;
        }
        int index =size-n, counter = 0;
        //if(index == 0) return dummy.next;
        ListNode prev= dummy;
        while(prev != null){
            if(index == counter){
                prev.next = prev.next.next;
                break;
            } else{
                counter++;
                prev = prev.next;
            }

        }
        return dummy.next;

    }
}
