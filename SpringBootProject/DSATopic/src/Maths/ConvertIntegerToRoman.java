package Maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConvertIntegerToRoman {
    public static void main(String[] args) {


        String notations[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        List<Integer> values = Arrays.asList(1000,900,500,400,100,90,50,40,10,9,5,4,1);
        int num = 9;
        integerToRoman(notations ,values , num);




      //  ===================
        HashMap<Character , Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        String s = "MCMXCIV";

        romanToIntegr(map ,s);
    }

    private static void romanToIntegr(HashMap<Character, Integer> map , String roman) {
        char ch[] = roman.toCharArray();
        int ans = 0;
        for (int i = 0; i < roman.length()-1; i++) {
            if(map.get(ch[i]) >= map.get(ch[i+1])){
                ans+=map.get(ch[i]);
            }else {
                ans-=map.get(ch[i]);
            }
        }
        ans+=map.get(ch[ch.length-1]);
        System.out.println(ans);

    }

    private static void integerToRoman(String[] notations, List<Integer> values, int num) {
        String roman = "";
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < values.size(); i++) {
            while (num>=values.get(i)){
                st.append(notations[i]);
                num-=values.get(i);
            }
        }
        String s = st.toString();
        System.out.println(s);

    }
}
