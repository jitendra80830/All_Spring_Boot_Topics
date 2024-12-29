package String;

public class AnagramString {
    public static void main(String[] args) {
        //“anagram” and “nagrama”
        String s = "anagram";
        String t = "nagrama";
        boolean anagramString = anagramString(s, t);
        System.out.println(anagramString);
    }

    private static boolean anagramString(String s, String t) {
        int freq[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                return false;
            }
        }
        return true;
    }
}
