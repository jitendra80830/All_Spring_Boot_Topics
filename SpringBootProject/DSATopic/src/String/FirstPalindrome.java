package String;

public class FirstPalindrome {
    public static void main(String[] args) {
        String ans ="";
        String[] word = {"abc","cac","ada","racecar","cool"};
        for (int i = 0; i <word.length ; i++) {
            if(isPalindrome(word[i])){
                ans = word[i];
                break;
            }
        }
        System.out.println(ans);

    }

    private static boolean isPalindrome(String words) {
        int i = 0;
        int j = words.length()-1;

        while (i<=j){

            if(words.charAt(i) != words.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}