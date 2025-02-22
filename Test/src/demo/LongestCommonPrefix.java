package demo;

import java.util.Arrays;

public class LongestCommonPrefix {
	  public static String longestCommonPrefix(String[] strs) {
		  Arrays.sort(strs);
		String st1=strs[0];
		String st2=strs[strs.length-1];
		String newst="";
		for (int i = 0; i < st1.length(); i++) {
			if(st1.charAt(0)!=st2.charAt(0)) {
				 return newst;	
			}
			if(st1.charAt(i)==st2.charAt(i)) {
				newst+=st1.charAt(i);
			}
			
		}
		  return newst;
		  
		  
	  }
	public static void main(String[] args) {
		
		String arr[]= {"dog","racecar","car"};
		System.out.println(longestCommonPrefix(arr));
	}

}
