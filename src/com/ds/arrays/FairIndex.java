package com.ds.arrays;

public class FairIndex {
    public static int fairIndex(int a[], int b[]){
        // WRITE YOUR BRILLIANT CODE HERE
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < a.length; i++) {
            sumA += a[i];
            sumB += b[i];
        }
        int count = 0;
        int tempA = a[0];
        int tempB = b[0];
        for (int i = 1; i < a.length; i++) {
            System.out.println(tempA);
            System.out.println(tempB);
            if (i != 1 && tempA == tempB && 2 * tempA == sumA && 2 * tempB == sumB) {
                count++;
            }
            tempA += a[i];
            tempB += b[i];
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(fairIndex(new int[]{4, -1, 0, 3}, new int[] {-2, 5, 0, 3}));
    }
}
