public class StringChallenge {
    public static String stringChallenge(String str) {
        // Check length
        if (str.length() < 8 || str.length() > 30) {
            return "false";
        }

        // Check for capital letter
        if (!str.matches(".*[A-Z].*")) {
            return "false";
        }

        // Check for number
        if (!str.matches(".*\\d.*")) {
            return "false";
        }

        // Check for punctuation or mathematical symbol
        String punctuation = "!@#$%^&*()_+-={}:<>?,./";
        if (!str.matches(".*[" + punctuation + "].*")) {
            return "false";
        }

        // Check for "password"
        if (str.toLowerCase().contains("password")) {
            return "false";
        }

        // All constraints met
        return "true";
    }

    public static void main(String[] args) {
        System.out.println(stringChallenge("password123!!!!")); // false
        System.out.println(stringChallenge("turkey90AAA=")); // true
        System.out.println(stringChallenge("apple!M7")); // true
    }
}
