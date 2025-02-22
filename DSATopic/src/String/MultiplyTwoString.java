package String;

public class MultiplyTwoString {
    public static void main(String[] args) {
        String n1 = "123";
        String n2 = "456";

        multiplyTwoString(n1 , n2);

    }

    private static String multiplyTwoString(String n1, String n2) {
        char[] s1 =  reverse(n1);
        char[] s2 = reverse(n2);
        int[] ans = new int[s1.length + s2.length];

        





        return null;
    }
    public static char[] reverse(String str){
       char ch[] = str.toCharArray();

       int i = 0;
       while (i < str.length()/2){
           char temp = ch[str.length()-1-i];
           ch[str.length()-1-i] = ch[i];
           ch[i] = temp;
           i++;
       }
       return ch;
    }
}
