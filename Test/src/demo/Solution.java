package demo;

import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char ch[] = s.toCharArray();
        int ans = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if(map.get(ch[i]) >= map.get(ch[i+1])){
                ans+=map.get(ch[i]);
            }else {
                ans-=map.get(ch[i]);
            }
        }
        ans+=map.get(ch[ch.length-1]);
        return ans;
        
    }
}
class Solutio1n {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for (int i = 0; i < strs.length ; i++) {
            while (strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0 , prefix.length()  -1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
		
	}
}
