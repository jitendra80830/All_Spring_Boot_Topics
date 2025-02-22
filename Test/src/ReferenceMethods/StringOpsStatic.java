package ReferenceMethods;

public class StringOpsStatic {
	
	public static String strOpss(String str)
	{
		String ans = "";
		for(int i =str.length()-1;i>=0;i--) {
			ans+=str.charAt(i);
		}
		return ans;
	}
}
