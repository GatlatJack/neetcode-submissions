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
    public ListNode reverseList(ListNode head) {
        //use neet two pointers approach

        ListNode prev = null;
        ListNode cur  =  head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev; // changing the direction of the pointer

            prev = cur; //advance prev to the next node
            cur = next;
        } 
        return prev;

    }
        

}
