package com.ashokit;

public class Main {
    public static void main(String[] args) {
        String input[] =  {"AMit", "AbdUL","Both"};

        String output[] =  {"amIT", "ABDul", "bOTH"};

        methodtest(input);





    }

    private static String methodtest(String[] input) {

        String result = "";
        for (int i = 0; i <input.length ; i++) {
            String ans = input[i];
            for (int j = 0; j <ans.length() ; j++) {
                char charAt = ans.charAt(j);
                if(Character.isUpperCase(charAt)){
                    result+=Character.toLowerCase(charAt);
                }else {
                    result+=Character.toUpperCase(charAt);
                }
            }
            System.out.println(result);
            result ="";
        }
        return null;


    }
}
