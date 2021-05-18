package com.ds.arrays;

import java.util.Scanner;

public class MissingNumberInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nt = Integer.parseInt(sc.nextLine());
		for(int i=0;i<nt;i++) {
			int size = Integer.parseInt(sc.nextLine());
			int arr[] = new int[size+1];
			String str[] = sc.nextLine().split(" ");
			for(int j=0;j<str.length;j++) {
				if(Integer.parseInt(str[j])!=0) {
					
				}
				arr[Integer.parseInt(str[j])] = 1;
			}
			for(int j =1;j<=size;j++) {
				if(arr[j]==0) {
					System.out.println(j);
					break;
				}
			}
			
		}
	}

}
