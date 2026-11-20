package Array;
//Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.
//
//Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
public class RemoveDuplicates2 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates2(arr));
    }

    private static int removeDuplicates2(int[] arr) {
        int inertIndex = 2;
        for (int currentIndex = 2; currentIndex < arr.length; currentIndex++) {
            if(arr[currentIndex]!= arr[inertIndex-2]){
                arr[inertIndex] = arr[currentIndex];
                inertIndex++;
            }
        }
        return inertIndex;
    }
//    private static int removeDuplicates2(int[] arr) {
////        int inertIndex = 2;
////        for (int currentIndex = 2; currentIndex < arr.length; currentIndex++) {
////
////        }
//                int i = 0;
//                int j = 0;
//                int count = 0;
//                while (j<arr.length ){
//                    if(arr[i]  == arr[j] ){
//                        j++;
//                    }if(arr[i]!=arr[j]){
//                        if((j-i) >= 2){
//
//
//                            count+=2;
//                        }else{
//                            count+=1;
//
//                        }
//                        i=j;
//                    }
//                }
//                if ((j - i) >= 2) {
//                    count += 2;
//                } else {
//                    count += 1;
//                }
//
//                return count;
//            }
//        }


}
