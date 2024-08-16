/************************************
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }

        ListNode tor = head;
        ListNode rab = head;

        while(rab != null && rab.next != null){
            tor = tor.next;
            rab = rab.next.next;
            if(tor == rab){
                System.gc();
                return true;
            }
        }
        return false;
    }
}