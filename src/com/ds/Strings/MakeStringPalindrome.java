package com.ds.Strings;

public class MakeStringPalindrome {
    public static void main(String[] args) {
        String s = "ABC";
        int cnt = 0;
        String appendedString  = "";
        while(s.length()>0 && !isPalindrome(s)){
            ++cnt;
            appendedString = appendedString.concat(String.valueOf(s.charAt(s.length()-1)));
            s = s.substring(0, s.length()-1);

        }
        System.out.println("Actual String needs to appended=="+ appendedString);
        System.out.println("Number of string to make existing string palindrome=="+ cnt);
    }

    public static boolean isPalindrome(String s) {
        int i =0;
        int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
