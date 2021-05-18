package com.ds.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TimeOut {
    public static void main(String[] arr){
        // In order to stop the task , we cannot stop the thread

        //ways to do it
        //1) Use Executor server and submit the callable task
        //You will get the future object and call cancel on that future object
        //
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<?> future = executorService.submit(()->{
            while(!Thread.currentThread().isInterrupted()){
                // Execute the steps
            }
        });

        try{
            Thread.sleep(10*60*1000); // it will stop the main thread for 10 mins then execute the next call
        }catch(InterruptedException e){

        }
        future.cancel(true);// this will try to stop the thread but it wont be able to do that

    }
}
