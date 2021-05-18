package com.ds.arrays;

class Test {
    public static void main(String[] arg){
        String[] abc = {"x"};
        try{

            doStuff(abc);
        }catch (Exception e){
            System.out.println("exec");
        }
        doStuff(abc);
    }
    static Integer doStuff(String[] args){
        return Integer.parseInt(args[0]);
    }
}

