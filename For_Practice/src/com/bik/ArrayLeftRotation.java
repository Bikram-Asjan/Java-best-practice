package com.bik;

public class ArrayLeftRotation {
	public int[] arrayLeftRotation(int[] arr, int n, int d) {
		for (int i = 0; i < d; i++) {
			int temp = 0;
			int j;
			temp = arr[0];
			for (j = 0; j < n - 1; j++) {
				arr[i] = arr[i + 1];
			}
			arr[i] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
			ArrayLeftRotation lr = new ArrayLeftRotation();
			int arr[] = {2,5,6,7,8};
			int[] arr2 = lr.arrayLeftRotation(arr, arr.length, 1);
			for(int i : arr2){
				System.out.print(i+"  ");
			}
			
	}

}
