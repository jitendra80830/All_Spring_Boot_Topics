package Maths;

public class ConvertToTitle {
    public static void main(String[] args) {
        int columnNumber = 701;
        String ans = convertToTitle(columnNumber);
        System.out.println(ans);
    }
    public static  String convertToTitle(int columnNumber) {
        StringBuffer sb = new StringBuffer();
        while(columnNumber>0){
            columnNumber--;
            int rem = columnNumber%26;
            char ch = (char) (rem+'A');
            sb.append(ch);
            columnNumber = columnNumber/26;
        }
        return sb.reverse().toString();

    }
}
