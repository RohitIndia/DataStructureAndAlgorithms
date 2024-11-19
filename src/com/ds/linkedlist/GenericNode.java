package com.ds.linkedlist;

public class GenericNode<T> {
    T data;
    GenericNode<T> next;

    @Override
    public String toString() {
        return "GenericNode{" +
                "data=" + data +
                "}";
    }

    public GenericNode(T data) {
        this.data = data;
    }

    public GenericNode(T data, GenericNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public GenericNode<T> getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(GenericNode<T> next) {
        this.next = next;
    }
}
