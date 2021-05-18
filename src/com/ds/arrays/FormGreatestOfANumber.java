package com.ds.arrays;

import java.util.Arrays;
import java.util.Collections;

public class FormGreatestOfANumber {
    public static void main(String[] args) {
        System.out.println(formMaxUpsideSixAndNine(99666));
        System.out.println(printMaxNum(99666));
        System.out.println(longestPalindrome("ababa"));
    }


    public static int formMaxUpsideSixAndNine(int n){
        int max =0;
        String s = Integer.toString(n);
        int[] arr  =new int[s.length()];
        int l = s.length()-1;
        while(n!=0) {
            arr[l] = n % 10;
            l--;
            n = n / 10;
        }
        for(int i =0;i<s.length();i++){
            StringBuilder str = new StringBuilder();
            int num = arr[i];
            if(num==6) {
                arr[i] = 9;
                Arrays.stream(arr).forEach((ii)->str.append(ii));
                return Math.max(Integer.parseInt(s), Integer.parseInt(str.toString()));
            }
        }
       return Integer.parseInt(s);
    }


    static int printMaxNum(int num)
    {
        // hashed array to store count of digits
        int count[] = new int[10];

        // Converting given number to string
        String str = Integer.toString(num);

        // Updating the count array
        for(int i=0; i < str.length(); i++)
            count[str.charAt(i)-'0']++;

        // result is to store the final number
        int result = 0, multiplier = 1;

        // Traversing the count array
        // to calculate the maximum number
        for (int i = 0; i <= 9; i++)
        {
            while (count[i] > 0)
            {
                result = result + (i * multiplier);
                count[i]--;
                multiplier = multiplier * 10;
            }
        }

        // return the result
        return result;
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
