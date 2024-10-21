package Array;

public class MostFrequentlyEle {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 2, 3, 1,1 ,7, 1, 1, 1, 3};
        int mostFrequentlyEle = mostFrequentlyEle(arr);
        System.out.println(mostFrequentlyEle);
    }

    private static int mostFrequentlyEle(int[] arr) {

        int freq[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        int freqele = 0;
        int max = 0;
        for (int i = 0; i < freq.length; i++) {
            if(max < freq[i]){
                max = freq[i];
                freqele = i;
            }
        }
        if(freqele!=0){
            return freqele;
        }
        return freqele;
    }
}
