package String;

public class ReverseString1 {
    public static void main(String[] args) {
        String str = "jitendrakumar";
        String reverse = reverse(str);
        System.out.println(reverse);
    }

    private static String reverse(String str) {
        char ch[] = str.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while (i <= ch.length / 2) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        String sb = "";
        for (int k = 0; k < ch.length; k++) {
            sb += ch[k];
        }
        return sb;
    }
}
