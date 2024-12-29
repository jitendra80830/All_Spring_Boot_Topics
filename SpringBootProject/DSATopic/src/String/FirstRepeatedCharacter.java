package String;

import java.util.HashMap;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String str = "abcdd";
        char firstRepeatedCharacter = firstRepeatedCharacter(str);
        System.out.println(firstRepeatedCharacter);
    }

    private static char firstRepeatedCharacter(String str) {

        HashMap<Character , Integer> map = new HashMap();
        char ans = 0;
        char[] toCharArray = str.toCharArray();
        for (int i = 0; i <toCharArray.length ; i++) {
            if(!map.isEmpty() && map.containsKey(toCharArray[i])){
                ans = toCharArray[i];
                break;
            }else {
                map.put(toCharArray[i],0);
            }

        }
        return ans;

    }
}
