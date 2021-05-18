package com.ds.BitWise;

public class NotOperator {
    public static void main(String[] args) {
        int x =5;
        System.out.println(~x); // OP: -6 // Because negative numbers are stored in 2s complement so simple formaula for 2s complement is 2^32-x
                                // we represet 2^32 = 2^32-1
                                // when n = 5 so 2s so after nagating the number and then find 2s complement: 2^32-1-5 = 2^32-6
                                // so acc to the formula at first comment x = 6

    }
}
