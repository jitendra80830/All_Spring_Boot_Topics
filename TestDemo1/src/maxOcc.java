import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class maxOcc {
    public static void main(String[] args) {
        List<String> values = Arrays.asList("aa", "bb", "cc", "aa", "bb", "aa");
         getMaxOccurringString(values);
    }

    private static void getMaxOccurringString(List<String> values) {
        HashMap<String , Integer> map = new HashMap<>();
        for(String str : values){
            if(map.containsKey(str)){
                map.put(str , map.get(str)+1);
            }else {
                map.put(str , 1);
            }
        }
        String maxkey = "";
        int maxVal = 0;
        for (String k  : map.keySet()){
            Integer cv = map.get(k);
            if(maxVal < cv){
                maxVal = cv;
                maxkey = k;
            }
        }
        System.out.println(maxkey+" "+ maxVal);
    }
}
