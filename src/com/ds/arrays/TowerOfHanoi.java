package com.ds.arrays;

public class TowerOfHanoi {

    public static void main(String str[]){
        int n = 3;
        char source = 'A';
        char destination ='C';
        char helper = 'B';
        solveTOH(n,source,destination,helper);

    }
    public static void solveTOH(int n, char source, char destination, char helper){
        if(n==1){
            System.out.println("moving "+n+ " plate from "+source+" to "+destination);
            return;
        }
        solveTOH(n-1, source,helper,destination);
        System.out.println("moving "+n+ " plate from "+source+" to "+destination);
        solveTOH(n-1, helper,destination,source);
    }
}
