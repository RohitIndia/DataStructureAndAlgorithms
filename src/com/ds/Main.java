package com.ds;

import com.ds.linkedlist.GenericMyLinkedList;

public class Main {
    public static void main(String[] args) {
        GenericMyLinkedList<Integer> myLinkedList = new GenericMyLinkedList<>();
        myLinkedList.insert(1);
        myLinkedList.insert(2);
        myLinkedList.insert(3);
        myLinkedList.insert(4);
        System.out.println(myLinkedList.toString());
        System.out.println(myLinkedList.length());
    }
}
