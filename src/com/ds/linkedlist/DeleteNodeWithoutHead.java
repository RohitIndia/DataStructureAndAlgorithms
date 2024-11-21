package com.ds.linkedlist;

public class DeleteNodeWithoutHead {
    public void deleteNode(ListNode node) {
        int nextVal = node.next.val;
        ListNode nextNext = node.next.next;
        node.val = nextVal;
        node.next = nextNext;
    }
}
