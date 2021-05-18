package com.ds.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadClass implements  Runnable{
    AtomicInteger value = new AtomicInteger(1);

    @Override
    public void run() {

        increementVal();
    }

    public  void  increementVal(){
        System.out.println(value.incrementAndGet());
    }
}
