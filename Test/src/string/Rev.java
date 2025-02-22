package string;

public class Rev {
	public String reverseStr(String s, int k) {
        char ch[] = s.toCharArray();
        int i = 0;
        int n = s.length();
        while (i < n){
            int j = Math.min(i+k-1 , n-1);
           revers2(ch , i , j);
           i = i+2*k;
        }
        String ans = "";
        for (int k1 = 0; k1 <ch.length; k1++) {
            ans+=ch[k1];
        }
        return ans;
    }
    public void revers2(char[] ch , int i , int j ){
        while (i<j){
            char left = ch[i];
            ch[i] = ch[j];
            ch[j] = left;
            i++;
            j--;
        }
    }

}
