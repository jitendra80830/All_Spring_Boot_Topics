package String;

public class FindtheIndexoftheFirstOccurrenceInAString {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issipi";
        int occurrenceInAString = findtheIndexoftheFirstOccurrenceInAString(haystack, needle);
        System.out.println(occurrenceInAString);
    }

    private static int findtheIndexoftheFirstOccurrenceInAString(String haystack, String needle) {
        int n = haystack.length();
        if(needle.length() > haystack.length()){
            return -1;
        }
        for (int i = 0; i < n-needle.length()+1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                String subStr = haystack.substring(i, needle.length() + i);
                if (subStr.equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
