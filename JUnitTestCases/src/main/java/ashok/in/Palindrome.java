package ashok.in;

public class Palindrome {


    public boolean checkPalindrome(String str){

        StringBuffer stringBuffer = new StringBuffer(str);
        String reverse = stringBuffer.reverse().toString();

        if(str.equals(reverse)){
            return true;
        }
        return false;
    }
}
