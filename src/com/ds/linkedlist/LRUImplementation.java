package com.ds.linkedlist;

import java.util.HashMap;

public class LRUImplementation {
    private static int count = 0;
    DoublyNode head = null;
    DoublyNode tail = null;
    private HashMap<Integer, DoublyNode> map;
    private int capacity;
    LRUImplementation(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();
        head = new DoublyNode(0,0);
        tail = new DoublyNode(0,0);
        head.next = tail;
        tail.pre = head;
        tail.next=null;
        head.pre = null;
    }

    private void addToHead(DoublyNode node){
        node.next = head.next;
        head.next = node;
        node.pre = head;
        node.next.pre= node;
    }
    public void deleteNode(DoublyNode node){
      node.pre.next = node.next;
      node.next.pre = node.pre;
    }

    public int get(int key){
        if(map.containsKey(key)){
            DoublyNode node = map.get(key);
            deleteNode(node);
            addToHead(node);
            return node.value;
        }
        return -1;
    }

    public void set(int key, int value){
        System.out.print("Inserting key "+key + " and value "+value);
        if(map.get(key)!=null){
            DoublyNode node  = map.get(key);
            deleteNode(node);
            node.value = value;
            addToHead(node);
        }else{
            DoublyNode node = new DoublyNode(key, value);
            map.put(key, node);
            if(count<=capacity){
                addToHead(node);
                count++;
            }else{
                map.remove(tail.pre.key);
                deleteNode(tail.pre);
                addToHead(node);
            }
        }
    }

}
