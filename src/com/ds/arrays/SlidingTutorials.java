package com.ds.arrays;

import java.util.*;

public class SlidingTutorials {

    // PROBLEM: Find the subArrays from an array of a given size
    // After finding the sub arrays , find out the maximum sum among the subarrays

    //Approaches
    //1) Brute Force approach , using two loops

    public static void main(String[] ar) {
        int[] arr = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int subArrSize = 4;
        int maxSum=0;
        for (int i = 0; i< arr.length; i++){
            int tempSum=0;
            for(int j=i; j<i+subArrSize; j++){
                if(j>=arr.length){
                    break;
                }
                tempSum += arr[j];
            }
            if(tempSum> maxSum){
                maxSum = tempSum;
            }
        }
//        System.out.println(maxSum);
//        System.out.println(getMaxSumOfSubArray(arr, subArrSize));
//        System.out.println(getAnagramCount("forxxorfxdofr", "for"));
        System.out.print(getLongestSubStringlength1("abcabcbb"));
    }

    // 2) Using sliding window concepts
    // How we identify , generally decide based on sub array or substring , based on window size or flexible window to find
    // below is the case of fixed size window
    //Calculate window size j-i+1 i is the start index, j is the end index

    static int getMaxSumOfSubArray(int arr[], int windowSize){
        int startIndex = 0;
        int endIndex = 0;
        int sum = 0;
        int max = 0;
        while(endIndex < arr.length){
            sum = sum+ arr[endIndex];
            if(endIndex-startIndex +1 < windowSize) {
                endIndex++;
            }else if(endIndex-startIndex +1 == windowSize ){
                // Here we are sliding the window by increementing start and end index
                max = Math.max(max, sum);
                sum = sum-arr[startIndex]; // remving the ith elemetn from the sum and add the next element
                startIndex++;
                endIndex++;
            }
        }
        return max;
    }

    // Print first negative number from window size k
    // Again follow the same fixed size structure
    static void firstNegativeNumber(int arr[], int windowSize){
        int startIndex= 0;
        int endIndex=0;
        ArrayList<Integer> al = new ArrayList<Integer>(); // this is used to store all the negative numbers
        while(endIndex < arr.length){
            if(arr[endIndex] < 0){
                al.add(arr[endIndex]);
            }
            if(endIndex-startIndex+1 < windowSize){
                endIndex++;
            }else if(endIndex-startIndex+1 == windowSize){
                if(al.size() < 0){
                    System.out.println('0');
                }else{
                    System.out.println(al.get(0)); // first elemtn will always be the negative number for that window
                    if(arr[startIndex] == al.get(0)){ // remove the ith element from list , if present at 0th position
                        al.remove(0);
                    }
                }
                startIndex++;
                endIndex++;
            }
        }
    }


    // Count Occurrences of Anagrams

    static int getAnagramCount(String str, String annaKey){
        int ans = 0;
        int startIndex = 0;
        int endIndex = 0;
        int windowSize = annaKey.length();
        Map<Character, Integer> map = new HashMap();
        for(char c: annaKey.toCharArray()){
            if(map.get(c)!=null){
                int count =  map.get(c);
                map.put(c, ++count);
            }else{
                map.put(c, 1);
            }
        }
        int countForMap = map.size();
        while(endIndex < str.length()){
            if(map.get(str.charAt(endIndex))!=null) {
                int count = map.get(str.charAt(endIndex));
                map.put(str.charAt(endIndex),--count);
                if(count==0){
                    countForMap--;
                }
            }
            if(endIndex-startIndex+1 < windowSize){
                endIndex++;
            }else if(endIndex-startIndex+1 == windowSize){
                if(countForMap == 0){
                    ans++;
                }
                char charAtStart = str.charAt(startIndex);
                if(map.get(charAtStart)!=null){
                    int count = map.get(charAtStart);
                    map.put(charAtStart, ++count);
                    if(count ==1){
                        countForMap++;
                    }
                }
                startIndex++;
                endIndex++;
            }
        }
        return ans;
    }

    //Maximum of all subarrays of size K
    static void getMaximumOfSubArray(int[] arr, int  windowSize){
        Queue<Integer> queue = new LinkedList<>();
        int startIndex = 0;
        int endIndex = 0;
        while(endIndex > arr.length){
            while(queue.size()>0 && queue.peek() < arr[endIndex]){
                queue.poll();
            }
            queue.add(arr[endIndex]);
            if(endIndex-startIndex+1 < 0) {
                endIndex++;
            }else if(endIndex-startIndex+1 == windowSize){
                System.out.println(queue.peek());
                if(queue.peek()== arr[startIndex]){
                    queue.poll();
                }
                startIndex++;
                endIndex++;
            }
        }
    }

    static int getLongestSubString(String s){
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int endIndex = 0;
        int startIndex = 0;
        while(endIndex< arr.length){
            if(map.containsKey(arr[endIndex])){
                int count = map.get(arr[endIndex]);
                map.put(arr[endIndex], ++count);
            }else{
                map.put(arr[endIndex], 1);
            }

            if(map.size() == endIndex-startIndex+1){
                System.out.println(map.size());
                max = Math.max(map.size(), max);
                endIndex++;
            }
            else if(map.size() < endIndex-startIndex+1){
                while(map.size() <endIndex-startIndex+1){
                    char ch = arr[startIndex];
                    int count = map.get(ch);
                    map.put(ch, --count);
                    if(map.get(ch)!=null && map.get(ch) == 0){
                        map.remove(ch);
                    }
                    startIndex++;
                }
                endIndex++;
            }
        }
        return max;
    }

    static int getLongestSubStringlength1(String s){
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

    // Variable sliding window:


}
