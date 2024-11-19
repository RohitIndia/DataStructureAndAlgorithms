package com.ds.arrays;

public class Main1 {

    public static void main(String[] args) {
        pX(7);
    }

    public static void pX(int x) {
        if (x > 1) {
            pX(x/2);
            pX(x/2);
            System.out.println("hi");
        }
        System.out.println(x);
    }
}



