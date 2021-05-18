package com.ds.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Semaphores {

    public static void main(String[] ar) throws InterruptedException {
        Semaphore semaphores = new Semaphore(3);
        ExecutorService service = Executors.newFixedThreadPool(10);
        IntStream.of(1000).forEach(i->{
            service.execute(new Task(semaphores));
        });
        service.shutdown();
        service.awaitTermination(1, TimeUnit.MINUTES);
    }

    static class Task implements Runnable{
        private Semaphore semaphore;
        Task(Semaphore s){
            this.semaphore = s;
        }
        @Override
        public void run() {
            try {
                semaphore.acquire();
                // IO Calls or resource shared
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                semaphore.release();
            }
        }
    }
}
