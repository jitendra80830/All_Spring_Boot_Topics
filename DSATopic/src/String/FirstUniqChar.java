package String;

public class FirstUniqChar {
    public static void main(String[] args) {
        String str = "eleetcode";
        int firstUniqChar = firstUniqChar(str);
        System.out.println(firstUniqChar);
    }

    private static int firstUniqChar(String str) {

        int freq[] = new int[26];
        for (int i = 0; i <str.length(); i++) {
            freq[str.charAt(i)- 97]++;
        }
        int index = 0;
        int flag = 0;
        for (int i = 0; i <str.length() ; i++) {
            if(freq[str.charAt(i) -97] ==1){
                index  = i;
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            return index;
        }else {
            return -1;
        }


    }
}
