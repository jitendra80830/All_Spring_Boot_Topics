package string;

public class AddString {
	public static void main(String[] args) {
		String nums1 = "11";
		String nums2 = "123";
		String string = addString(nums1, nums2);
		System.out.println(string);
	}

	private static String addString(String nums1, String nums2) {
		StringBuffer sb = new StringBuffer();

		int i = nums1.length() - 1;
		int j = nums2.length() - 1;
		int cary = 0;
		while (i >= 0 || j >= 0 || cary != 0) {
			int sum = 0;
			int num1 = i >= 0 ? nums1.charAt(i) - '0' : 0;
			int num2 = j >= 0 ? nums2.charAt(j) - '0' : 0;
			sum = num1 + num2  + cary;
			sb.append(sum % 10);
			cary = sum / 10;

			i--;
			j--;

		}

		return sb.reverse().toString();

	}

}
