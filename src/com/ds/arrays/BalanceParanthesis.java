package com.ds.arrays;

import java.util.Stack;

public class BalanceParanthesis {
    public static void main(String[] str){
        String expression = "{([])}";
        if(checkBalanced(expression)){
            System.out.print("Balanced");
        }else{
            System.out.print("Not Balanced");
        }

    }
    public static boolean checkBalanced(String exp ){
        char[] expArr = exp.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i < expArr.length; i++){
            if(expArr[i]=='{'||expArr[i]=='('|| expArr[i]=='['){
                    stack.push(expArr[i]);
                    continue;
            }
            char character = expArr[i];
            char check;
            switch (character){
                    case ')':
                    check = stack.pop();
                    if(check=='{' || check=='['){
                        return false;
                    }
                    break;
                    case '}':
                    check = stack.pop();
                    if(check=='(' || check=='['){
                        return false;
                    }
                    break;
                    case ']':
                    check = stack.pop();
                    if(check=='(' || check=='{'){
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}
