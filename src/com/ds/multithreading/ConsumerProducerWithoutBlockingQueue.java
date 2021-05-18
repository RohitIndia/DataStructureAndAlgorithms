package com.ds.multithreading;

import java.util.Random;

public class ConsumerProducerWithoutBlockingQueue {
    public  static void main(String[] str){
        MyBlockingQueue<Integer> myBlockingQueue = new MyBlockingQueue<>(10);
        Random random = new Random();
        final  Runnable producer = ()->{
            myBlockingQueue.put(random.nextInt());
        };
        new Thread(producer).start();
        new Thread(producer).start();

        final Runnable consumer = ()->{
            System.out.print(myBlockingQueue.take());
        };
        new Thread(consumer).start();
        new Thread(consumer).start();
    }
}
