package com.ds.linkedlist;

public class DoublyNode {
    int key;
    int value;
    DoublyNode next;
    DoublyNode pre;

    DoublyNode(int key, int value){
        this.key=key;
        this.value=value;
        this.next=null;
        this.pre=null;
    }
}
