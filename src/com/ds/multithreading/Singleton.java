package com.ds.multithreading;

public class Singleton {

    private static class Holder{
        private static Singleton INSTANCE = new Singleton();
    }

    private Singleton(){

    }
    public Singleton getInstance(){
        return Holder.INSTANCE;
    }
}
