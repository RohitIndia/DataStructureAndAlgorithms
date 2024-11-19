package com.ds.linkedlist;

public class GenericMyLinkedList<T> {
    private GenericNode<T> head;
    private long length;

    public GenericMyLinkedList() {
        this.head = null;
        this.length = 0L;
    }

    public void insert(T data){
        GenericNode<T> node  = new GenericNode<T>(data);
        if (head != null) {
            GenericNode next = head;
            node.setNext(next);
        }
        head  = node;
        this.length++;
    }

    public long length(){
        return this.length;
    }

    public void delete(T data){
        GenericNode<T> current  = head;
        GenericNode<T> prev = head;
        if(head!=null&&head.getData()==data){
            head = head.getNext();
            --length;
        }else {
            while (current != null) {
                if (current.getData() == data) {
                    prev.setNext(current.getNext());
                    --length;
                    return;
                }
                prev  = current;
                current = current.getNext();
            }
        }
    }

    public String toString(){
        StringBuilder str = new StringBuilder("[");
        GenericNode<T> curr = head;
        long temp = this.length;
        while(curr!=null){
            str.append(curr.getData().toString());
            if(temp>1) {
                str.append(",");
            }
            temp--;
            curr = curr.getNext();
        }
        str.append("]");
        return str.toString();
    }
}
