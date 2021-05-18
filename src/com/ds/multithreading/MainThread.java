package com.ds.multithreading;

public class MainThread {
    volatile  int value = 1;
    public static void main(String[] str){
        ThreadClass th = new ThreadClass();
        Thread t1 = new Thread(th);
        Thread t2 = new Thread(th);
        t1.start();
        t2.start();
    }
}
