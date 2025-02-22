package demo;

public class Paranthesis {
	 public static boolean isValid(String s) {
		 boolean chk=false;
			for (int i = 0; i < s.length(); i++) {
				for (int j = 1; j < s.length(); j++) {
				if(s.charAt(i)=='(') {
					
				if(s.charAt(j)=='(') {
					return false;
				}if(s.charAt(j)==')') {
					chk=true;
				}
				}if(s.charAt(i)=='{') {
					
				if(s.charAt(j)=='{') {
					return false;
				}if(s.charAt(j)=='}') {
					chk=true;
				}
				}if(s.charAt(i)=='[') {
					
				if(s.charAt(j)=='[') {
					return false;
				}if(s.charAt(j)==']') {
					chk=true;
				}
				}
			
			}
			}
			
			return chk;
	    }
	public static void main(String[] args) {
		System.out.println(isValid("{()}{}[][]"));
		
	}

}
