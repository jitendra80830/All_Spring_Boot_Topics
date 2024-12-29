package Main3;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayProb {
    public static void main(String[] args) {
        String[] list = {"aa", "aa", "cb", "cb", "bb", "bb", "bb"};
        freqString(list);


    }

    private static void freqString(String[] list) {
        HashMap<String, Integer> hashMap = new HashMap();
        //System.out.println(list[0]);

        for (int i = 0; i < list.length; i++) {
            if (hashMap.containsKey(list[i])) {
                hashMap.put(list[i], hashMap.getOrDefault(list[i], 0) + 1);
            }else {
                hashMap.put(list[i],1);
            }
        }
        System.out.println(hashMap);
    }
//    /
/*Node { int value ,
    Node next}*/

    //1,2,3,4
    //7,8,9,3

}
