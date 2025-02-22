package maths;

import java.util.Iterator;

public class AddDataInArryaFromEnd {
	public static void main(String[] args) {
		int arr[] = { 16, 11, 22, 12, 45, 21, 2 };
		addDataInArryaFromEnd(arr);
	}

	private static void addDataInArryaFromEnd(int[] arr) {

		int temp = arr[arr.length - 1];
		int cary = 0;
		for (int i = arr.length - 2; i >= 0; i--) {
			int add = 0;
			if (cary <= 0) {
				add = arr[i] + temp;
			} else {
				add = arr[i] + cary;
			}
			temp = 0;
			if (i == 0) {
				arr[i] = add;
			} else {
				arr[i] = add % 10;// 3
				cary = add / 10;// 2
			}

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
