/**
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
        ListNode tor = head;
        ListNode rab = head;
        while(rab != null && rab.next != null){
            tor = tor.next;
            rab = rab.next.next;
            if(rab == null){
                return false;
            }
            else if(tor == rab){
                System.gc();
                return true;
            }
        }
        return false;
    }
}