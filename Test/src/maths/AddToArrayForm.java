package maths;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class AddToArrayForm {

	/*
	 * Input: num = [1,2,0,0], k = 34 Output: [1,2,3,4] Explanation: 1200 + 34 =
	 * 1234
	 */
	public static void main(String[] args) {
		int num[] = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
		int k = 516;
		List<Integer> toArrayForm = addToArrayForm(num, k);
		System.out.println(toArrayForm);

	}

	public static int findLen(long sum) {
		int count = 0;
		while (sum != 0) {
			sum = sum / 10;
			count++;
		}
		return count;
	}

	// 129 , 83
	private static String addTwoNum(long nums1, int nums2) {
		StringBuffer sb = new StringBuffer();
		int i = findLen(nums1);// 1200
		int j = findLen(nums2);// 34
		long cary = 0;
		while (i > 0 || j > 0 || cary != 0) {
			long sum = 0;
			long n1 = i >= 0 ? nums1 % 10 : 0;
			long n2 = j >= 0 ? nums2 % 10 : 0;
			sum = n1 + n2 + cary;
			nums1 /= 10;
			nums2 /= 10;
			sb.append(sum % 10);
			cary = sum / 10;

			i--;
			j--;
		}
		return sb.reverse().toString();
	}

	private static List<Integer> addToArrayForm(int[] num, int k) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < num.length; i++) {
			sb.append(num[i]);
		}
		String stringNum = sb.toString();
		BigInteger bigNumber = new BigInteger(stringNum);
		//Float number = Float.parseFloat(stringNum);
		long sum =(Long.parseLong(stringNum));
		
		String twoNum = addTwoNum(sum, k);
		// System.out.println(sum);
		long SunNum =Long.parseLong(twoNum);
		long originalNum = SunNum;

		int count = findLen(SunNum);

		int arr[] = new int[count];
		for (int i = arr.length - 1; i >= 0; i--) {
			long lastDigit = originalNum % 10;
			originalNum = originalNum / 10;
			arr[i] = (int) lastDigit;
		}
		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			// System.out.print(arr[i]+" ");
			ans.add(arr[i]);
		}
		return ans;
	}

}
