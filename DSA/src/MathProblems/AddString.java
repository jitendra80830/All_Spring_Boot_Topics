package MathProblems;

public class AddString {
    public static void main(String[] args) {
        String num1 = "456";
        String num2 = "77";
        String addStrings = addStrings(num1, num2);
        System.out.println(addStrings);

    }

    public static String addStrings(String num1, String num2) {

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int cary = 0;
        StringBuffer sb = new StringBuffer();

        while (i >= 0 || j >= 0 || cary != 0) {
            int n1 = i >= 0 ? num1.charAt(i)-'0' : 0;
            int n2 = j >= 0 ? num2.charAt(j)-'0' : 0;
            int sum = n1 + n2 + cary;
            sb.append(sum%10);
            cary = sum/10;
            i--;
            j--;
        }
        return sb.reverse().toString();

    }
}
