package String;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World iiiiuyy";
        int ofLastWord = lengthOfLastWord(s);
        System.out.println(ofLastWord);
    }

    private static int lengthOfLastWord(String str) {
        String s = str.trim();
        int count = 0;
        for (int i = 0; i <s.length(); i++) {
            if(str.charAt(i) == ' '){
                count = 0;
            }else {
                count++;
            }
        }
        return count;
    }
}
