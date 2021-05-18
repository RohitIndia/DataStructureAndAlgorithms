package com.ds.multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocale {
private static ExecutorService threadPool = Executors.newFixedThreadPool(10);
public static ThreadLocal<SimpleDateFormat> df = ThreadLocal.withInitial(()->new SimpleDateFormat("yyyy-MM-dd"));
    public static void main(String[] arg) throws InterruptedException {
        Runnable rc = ()->{
            String birthdate = new ThreadLocale().birthDate(100);
            System.out.println(birthdate);
        };

        Thread th1 = new Thread(rc);
        Thread th2 = new Thread(rc);
        th1.start();
        th2.start();

        for(int i =0;i<100;i++){
            int id=i;
            threadPool.submit(()->{
                String birthdate = new ThreadLocale().birthDate(id);
                System.out.println(birthdate);
            });
        }
        Thread.sleep(1000);
    }

    public String birthDate(int userId){
        Date birthdate =  birthDateFromDb(userId);
        SimpleDateFormat formatter = df.get();
        return formatter.format(birthdate);
    }
    public static Date birthDateFromDb(int userId){
        return new Date();
    }
}
