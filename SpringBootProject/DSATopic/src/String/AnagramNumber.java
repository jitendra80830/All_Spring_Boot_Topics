package String;

public class AnagramNumber {
    public static void main(String[] args) {
        String st1 = "anagram";
        String st2 = "nagaram";


        anagramNumber(st1 ,st2);

    }

    private static boolean anagramNumber(String s, String t) {
        int charCount[] = new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for (int i = 0; i <s.length() ; i++) {
            charCount[s.charAt(i)-97]++;
        }
        for (int i = 0; i <t.length() ; i++) {
            charCount[t.charAt(i)-97]--;
        }
        int falg = 0;
        for (int i = 0; i <charCount.length ; i++) {
            if(charCount[i]>=1){
                return false;
            }
        }
        return true;
    }
}
