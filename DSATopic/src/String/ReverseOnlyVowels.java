package String;

public class ReverseOnlyVowels {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverseOnlyVowels(str));
    }

    private static String reverseOnlyVowels(String str) {
        char[] ch = str.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while (i<=j){
            if(isVowel(ch[i]) && isVowel(ch[j])){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }else if (!isVowel(ch[i])){
                i++;
            }else if (!isVowel(ch[j])){
                j--;
            }
        }
        StringBuilder s = new StringBuilder();
        for (int c = 0; c < ch.length; c++) {
            s.append(ch[c]);
        }
        String ans = "";
        ans = s.toString();
        //System.out.println(ans);
        return ans;

    }

    private static boolean isVowel(char ch) {
        if(ch =='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i'
                || ch =='I'|| ch=='o'||ch=='O' || ch=='u' || ch=='U'){
            return true;
        }
        return false;
    }
}
