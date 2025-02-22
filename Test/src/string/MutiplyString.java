package string;

public class MutiplyString {
	public static void main(String[] args) {
		String num1 = "9";
		String num2 = "99";
		String multiply = multiply(num1, num2);
		System.out.println(multiply);
	}

	public static String multiply(String num1, String num2) {
		// char[] s1 = reverse(num1);
		/// char[] s2 = reverse(num2);
		if (num1.equals("0") || num2.equals("0")) {
			return "0";
		}
		int cary = 0;
		int index = 0;
		int ans[] = new int[num1.length() + num2.length()];
		for (int i = num1.length() - 1; i >= 0; i--) {
			// index = i;
			// int mul = 1;
			// int sum=0;
			for (int j = num2.length() - 1; j >= 0; j--) {
				/*
				 * int n1 = s1[i] - '0'; int n2 = s2[j] - '0';
				 */
				/*
				 * int mul = n1 * n2 + cary + ans[index]; ans[index] = mul % 10; cary = mul /
				 * 10; index++;
				 */

				int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				int sum = mul + ans[i + j + 1];

				System.out.println(sum);
				ans[i + j + 1] = sum % 10;
				ans[i + j] += sum / 10;

			}
			/*
			 * if (cary != 0) { ans[index] = cary; }
			 */
		}
		StringBuffer sb = new StringBuffer();
		for (int i : ans) {
			if (!(sb.length() == 0 && i == 0)) {
				sb.append(i);
			}
		}
		return sb.toString();

	}

	public static char[] reverse(String str) {
		char ch[] = str.toCharArray();
		int i = 0;
		while (i < str.length() / 2) {
			char temp = ch[(str.length() - 1) - i];
			ch[(str.length() - 1) - i] = ch[i];
			ch[i] = temp;
			i++;
		}
		return ch;
	}

}
