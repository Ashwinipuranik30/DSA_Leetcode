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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b)-> a.val-b.val);

        for(ListNode node : lists){
            if(node!=null){
                minHeap.offer(node);
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while(!minHeap.isEmpty()){
            ListNode currentnode = minHeap.poll();
            tail.next=currentnode;
            tail=tail.next;

            if(currentnode.next!=null){
                minHeap.offer(currentnode.next);
            }
        }

        return dummy.next;

        
    }
}