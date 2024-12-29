package String;

public class ReverseOnlyLetter {
    public static void main(String[] args) {

        String stsr = "a-bC-dEf-ghIj";
        reverseOnlyLetter(stsr);//j-Ih-gfE-dCba
    }

    private static String reverseOnlyLetter(String str) {

        char[] ch = str.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while (i <= j) {
            if(Character.isLetter(ch[i]) && Character.isLetter(ch[j])){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }else if(!Character.isLetter(ch[i])){
                i++;
            } else if (!Character.isLetter(ch[j])) {
                j--;

            }
        }
        StringBuilder s = new StringBuilder();
        for (int c = 0; c < ch.length; c++) {
            s.append(ch[c]);
        }
        String ans = "";
        ans = s.toString();
        System.out.println(ans);
        return ans;
    }
}
