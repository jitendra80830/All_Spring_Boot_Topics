package String;

public class MostWordsFound {
    public static void main(String[] args) {
        String[] word = {"abc ggg hhh hh", "cac", "ada", "racecar jj iu kjkj kjkj kjkj ddd ww", "cool"};
        int mostWordsFound = mostWordsFound(word);
        System.out.println(mostWordsFound);
    }

    private static int mostWordsFound(String[] word) {

        int currMax = 0;
        int maxLen = 0;
        for (String str : word) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    currMax++;
                }
            }
            maxLen = Math.max(maxLen, currMax);
            currMax = 0;
        }
        return maxLen + 1;
    }
}
