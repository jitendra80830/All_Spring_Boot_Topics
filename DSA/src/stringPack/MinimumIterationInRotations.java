package stringPack;

public class MinimumIterationInRotations {
    public static void main(String[] args) {
        String s = "abcde";
        String match = "pqrde";
        int clockwiseIterationInRotations = clockwiseIterationInRotations(s, match);
        //System.out.println(clockwiseIterationInRotations);
        int antyClockwiseIterationInRotations = AntyClockwiseIterationInRotations(s, match);
       // System.out.println();

        if (clockwiseIterationInRotations < antyClockwiseIterationInRotations) {
            System.out.println("Clock wise is a min " + clockwiseIterationInRotations);
        } else if (antyClockwiseIterationInRotations < clockwiseIterationInRotations) {
            System.out.println("Anty Clock wise " + antyClockwiseIterationInRotations);
        } else {
            System.out.println("String not matched");
        }
    }

    private static int clockwiseIterationInRotations(String s, String match) {

        //clcok wise
        char[] ch = s.toCharArray();
        for (int i = 1; i <= s.length(); i++) {
            char firstChar = ch[0];
            //shifting
            for (int j = 1; j < ch.length; j++) {
                ch[j - 1] = ch[j];
            }
            ch[ch.length - 1] = firstChar;

            StringBuffer sb = new StringBuffer();
            for (int k = 0; k < ch.length; k++) {
                sb.append(ch[k]);
            }

            String ans = sb.toString();
            if (match.equals(ans)) {
                //System.out.println(match + " " + ans);
                return i;
            }

        }
        return -1;
    }

    public static int AntyClockwiseIterationInRotations(String s, String match) {

        char ch[] = s.toCharArray();
        for (int i = 1; i <= s.length(); i++) {
            char lastChar = ch[ch.length - 1];

            //shifting
            for (int j = ch.length - 2; j >= 0; j--) {
                ch[j + 1] = ch[j];
            }
            ch[0] = lastChar;

            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < ch.length; j++) {
                sb.append(ch[j]);
            }

            String ans = sb.toString();
            if (match.equals(ans)) {
                return i;
            }
        }
        return -1;

    }
}
