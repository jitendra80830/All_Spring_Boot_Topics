package String;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "abc";
       boolean ans =  validPalindrome2(s);
        System.out.println(ans);
        //validPalindrome2(s);
    }

    private static boolean validPalindrome2(String s){
        int i = 0;
        int j = s.length()-1;
        while (i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return validPalindrome(s , i+1,j) || validPalindrome(s , i ,j-1);
            }
            i++;
            j--;
        }
        return true;

    }

    private static boolean validPalindrome(String s ,int i , int j) {

     /*   int i = 0;
        int j = s.length()-1;*/
        while (i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
