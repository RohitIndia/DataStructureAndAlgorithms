package com.ds.linkedlist;

public class RemoveNthNodeFromEnd {
    //LeetCode Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/

    // New way of calculating the length or reaching to a particular node.
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode curr = dummy;
        ListNode prev  = dummy;
        while(curr.next!=null){
            if(n==0){
                prev  = prev.next;
            }else{
                --n;
            }
            curr = curr.next;
        }
        prev.next = prev.next.next;
        return dummy.next;
    }

    // Using two pointer we can reach to the node we were looking., we can say a new way of finding the length
    public ListNode removeNthFromEnd(ListNode head, int n, String type) {
        ListNode dummy = new ListNode(0,head);
        ListNode fast = dummy;
        ListNode slow  = dummy;
        for(int i=0;i<=n;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow =slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
