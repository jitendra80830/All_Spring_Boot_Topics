public class MaximumConsecutive {
    public static void main(String[] args) {
        String str = "ttuosoovouuutpptt";
        maximumConsecutive(str);

    }

    private static void maximumConsecutive(String str) {
        int max = 0;
        char ch = 0;
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
                if (count > max) {
                    max = count;
                    ch = str.charAt(i);
                }
            } else {
                count = 0;
            }
        }
        System.out.println(ch);
    }
}
