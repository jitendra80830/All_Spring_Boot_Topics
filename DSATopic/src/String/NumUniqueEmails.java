package String;

import java.util.HashSet;
import java.util.Set;

public class NumUniqueEmails {
    public static void main(String[] args) {
        String[] str = {"test.email+alex@leetcode.com",
                        "test.e.mail+bob.cathy@leetcode.com",
                        "testemail+david@lee.tcode.com"};
        int n = numUniqueEmails(str);
        System.out.println(n);
    }

    private static int numUniqueEmails(String[] str) {
        Set<String> stringSet = new HashSet<>();
        for (String s :str){
            String localNane = s.substring( 0 , s.indexOf('@'));
            if(localNane.contains("+")){
                localNane = localNane.substring(0 , localNane.indexOf('+'));
            }
            if(localNane.contains(".")){
                localNane = localNane.replace(".","");
            }
            System.out.println(localNane);
            String email = localNane+ s.substring(s.indexOf('@') , s.length());
            stringSet.add(email);
        }
        return stringSet.size();
    }
}
