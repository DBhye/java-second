package com.koreait.second;

import java.util.Arrays;
import java.util.Random;

public class Utils {

	public static void main(String[] args) {

	}

	// 매개변수 갯수가 다르거나, 매개변수 타입이 다를때 오버로딩한다.
	// static 메소드는 가능한한 지향해야한다.
	public static int parseStringToInt(String n, int num) {
		try {
			return Integer.parseInt(n);

		} catch (Exception e) {
			return num;

		}

	}

	public static int parseStringToInt(String n) {
		/*
		 * try { return Integer.parseInt(n); } catch (Exception e) { return 0; }
		 */
		return parseStringToInt(n, 0);
	}

	public static void sortASC(int[] arr) {
		sort(arr, true);
	}

	public static void sortDESC(int[] arr) {
		sort(arr, false);
	}

	private static void sort(int[] arr, boolean asc) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int z = i + 1; z < arr.length; z++) {
				if (asc == arr[i] > arr[z]) {
					int temp = arr[i];
					arr[i] = arr[z];
					arr[z] = temp;
				}

			}
		}
	}

	public static int[] createRandomArr(int min, int max, int n) {
		int[] Arr = new int[n];
		for (int i = 0; i < n; i++) {
			Arr[i] = (int) (Math.random() * (max - min + 1) + min);

		}
		return Arr;
	}

	public static int[] createRandomArrNoDuplication(int min, int max, int n) {
		int[] Arr = new int[n];
		for (int i = 0; i < n; i++) {
			Arr[i] = (int) (Math.random() * (max - min + 1) + min);
			for (int z = 0; z < i; z++) {
				if (Arr[i] == Arr[z]) {
					i--;

				}
				
				
			}

		}
		return Arr;
	}

	public static void printArr(int[] arr) {
		System.out.print(Arrays.toString(arr));	//1 엔터 //2 엔터 // 3 엔터
	}
	
	
	public static String makeStarTriangle (int star) {
	
		for(int i=0; i<star; i++) {
			System.out.println("");
			for(int z=0; z<=i; z++) {
				System.out.print("*");
			}
		} 
	}
}
