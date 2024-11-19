package com.ds.arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SubArray {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//7
//30 99 sign-in
//30 105 sign-out
//12 100 sign-in
//20 80 sign-in
//12 120 sign-out
//20 101 sign-out
//21 110 sign-in
//20
//4
//60 12 sign-in
//80 20 sign-out
//10 20 sign-in
//60 20 sign-out
//100
//		int numberOfTestCases = Integer.parseInt(sc.nextLine());
//		for (int i = 0; i < numberOfTestCases; i++) {
//			String str[] = sc.nextLine().split(" ");
//			int n = Integer.parseInt(str[0]);
//			int sum = Integer.parseInt(str[1]);
//			String str1[] = sc.nextLine().split(" ");
//			int[] arr = new int[n];
//			int k = 0;
//			for (String j : str1) {
//				arr[k] = Integer.parseInt(j);
//				k++;
//			}
//			subArray(arr,n,sum);
//		}

//		Scanner sc = new Scanner(System.in);
//		int n = Integer.parseInt(sc.nextLine());
//		Map<String, Integer> sign_in_times  = new HashMap<>();
//		List<String> list1 = new ArrayList<>();
		Map<String, Integer> sign_in_times  = new HashMap<>();
//		int n = 7;
		//String [] logs = {"30 99 sign-in", "30 105 sign-out", "12 100 sign-in", "20 80 sign-in", "12 120 sign-out", "20 101 sign-out", "21 110 sign-in"};
//		int maxSpan = 20;
		List<String> result = new ArrayList<>();
		List<String> logs =  new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++){
			logs.add(sc.nextLine());
		}
		int maxSpan = Integer.parseInt(sc.nextLine());
//		for(int i =0;i<logs.size();i++) {
//			String[] str = logs.get(i).split(" ");
//			String user_id = str[0];
//			String timestamp = str[1];
//			String action = str[2];
//			int delta = 0;
//			if(action.equals("sign-in")) {
//				sign_in_times.put(user_id, Integer.parseInt(timestamp));
//			} else if (action.equals("sign-out") && sign_in_times.containsKey(user_id)) {
//
//					int sign_out_time = Integer.parseInt(timestamp);
//					int sign_in_time = sign_in_times.get(user_id);
//					delta = sign_out_time-sign_in_time;
//					if(delta<=maxSpan){
//						result.add(user_id);
//					}
//
//			}
//			String temp1[]=logs.get(i).split(" ");
//			int id1=Integer.valueOf(temp1[0]);
//			int logInTime=Integer.valueOf(temp1[1]);
//			String action1 = temp1[2];
//			for(int j=i+1;j<logs.size();j++) {
//				String temp2[] = logs.get(j).split(" ");
//				int id2 = Integer.valueOf(temp2[0]);
//				int logOutTime = Integer.valueOf(temp2[1]);
//				String action2 = temp2[2];
//				if (id2 == id1) {
//					if (Math.abs(logOutTime - logInTime)<= maxSpan && !action2.equals(action1)) {
//						result.add(String.valueOf(id1));
//					}
//					break;
//				}
//			}
//		}
//		}

		for(int i=0;i<logs.size();i++){
			String temp1[]=logs.get(i).split(" ");
			int id1=Integer.valueOf(temp1[0]);
			int logInTime=Integer.valueOf(temp1[1]);
			String action1 = temp1[2];
			if(sign_in_times.containsKey(temp1[0])){
				if(Math.abs(sign_in_times.get(temp1[0]) - logInTime)<= maxSpan){
					result.add(temp1[0]);
				}
			}else{
				sign_in_times.put(temp1[0], logInTime);
			}
		}

		Collections.sort(result);
		result.forEach(e->System.out.println(e));
		//result.stream().sorted(Comparator.comparingInt(sro->Integer.parseInt(sro.toString()))).forEach(e->System.out.println(e));
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
