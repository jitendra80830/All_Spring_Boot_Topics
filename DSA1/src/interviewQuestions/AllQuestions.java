package interviewQuestions;


import java.util.HashMap;

public class AllQuestions {
    public static void main(String[] args) {
        int pow = power(2,3);
        System.out.println(pow);
        allAccurarance("abbaassdd");
        prime();
        boolean ana = anagram("abcdda", "aacddb");
        System.out.println();
        System.out.println(ana);
    }

    private static boolean anagram(String a, String b) {
        int count[]  = new int[26];
        for(int i = 0;i<a.length();i++){
            count[a.charAt(i) -'a']++;
        }
        for(int i = 0;i<b.length();i++){
            count[b.charAt(i) -'a']--;
        }
        int flag =0;
        for(int i = 0;i<26;i++){
            if(count[i]>=1){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            return true;
        }else{
            return false;
        }


    }

    private static void prime() {
        for(int i = 15;i>=1;i--){
            int count = 0;
            for(int j =1;j<=i;j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.print(i+" ");
            }
        }
    }



    private static void allAccurarance(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i) , map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i) ,1);
            }
        }
        for(Character k : map.keySet()){
            System.out.println(k+" = "+map.get(k));
        }
    }

    private static int power(int x, int n) {
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }

        return x * power(x , n-1);

    }
}

