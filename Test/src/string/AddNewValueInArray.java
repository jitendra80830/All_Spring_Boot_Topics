package string;

public class AddNewValueInArray {
	public static void main(String[] args) {
		String arr[] = { "SQL", "PYTHON", "JAVA", "C", "C#" };
		addJQueryInArray(arr);
	}

	private static void addJQueryInArray(String[] arr) {
		int index = -1;// 2
		String ans[] = new String[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("JAVA")) {
				index = i;
			}
		}
		for (int i = 0; i <= index; i++) {
			ans[i] = arr[i];
		}
		ans[index + 1] = "JQUERY";
		for (int i = index + 1; i < arr.length; i++) {
			ans[i + 1] = arr[i];
		}

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

}
