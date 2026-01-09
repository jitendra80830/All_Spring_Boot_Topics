package stringpackage;

class LongestCommonPrefix {
    public static void main(String[] args) {
        String str[] = {"flower","flow","flight"};
        String ans = longestCommonPrefix(str);
        System.out.println(ans);
    }

    private static String longestCommonPrefix(String[] str) {
        if(str.length == 0 || str.length == 1){
            return "";
        }
        String prefix = str[0];
        for (int i = 0; i < str.length; i++) {
            while (str[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0 , prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }

}
