package com.ds.arrays;

import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numberOfTestCases = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numberOfTestCases; i++) {
			String str[] = sc.nextLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int sum = Integer.parseInt(str[1]);
			String str1[] = sc.nextLine().split(" ");
			int[] arr = new int[n];
			int k = 0;
			for (String j : str1) {
				arr[k] = Integer.parseInt(j);
				k++;
			}
			subArray(arr,n,sum);
		}
	}

	public static int subArray(int[] arr, int n, int sum) {

		for (int i = 0; i < n; i++) {
			int currentSum = arr[i];
			for (int j = i + 1; j <= n; j++) {
				if (currentSum == sum) {
					System.out.println(i+1 + " " + j);
					return 1;
				}
				if (currentSum > sum || j==n) {
					break;
				}
				currentSum = currentSum + arr[j];
			}
		}
		System.out.println(-1);
		return 0;
	}

}
