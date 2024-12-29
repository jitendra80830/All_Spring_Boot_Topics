package String;

public class ReverseString {
    public static void main(String[] args) {
        
        char[] ch = {'h','e','l','o'};
        reverse(ch);
        //reverse2("prahant");
    }

    private static void reverse2(String prahant) {

        String s = "";
        for (int i = prahant.length()-1; i>=0 ; i--) {
            s+=prahant.charAt(i);
        }
        System.out.println(s);
    }

    private static void reverse(char[] ch) {

        int last = ch.length-1;
        int half = ch.length/2;

        for (int i = 0;i<half;i++) {
            char temp = ch[i];
            ch[i] = ch[last - i];
            ch[last - i] = temp;
        }
        System.out.println(ch);
    }
}
