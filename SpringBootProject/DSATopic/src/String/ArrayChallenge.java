package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayChallenge {

    // Function to perform the operation as described in the problem
    public static int findAdjacentDuplicates(int num) {
        List<Integer> digitList = new ArrayList<>();
        int originalNum = num;  // Keep track of the original number

        // Add initial digits of the number to the list
        appendDigitsToList(num, digitList);

        int multiplicationCount = 0;

        while (true) {
            multiplicationCount++;

            // Get any digit from the original number for multiplication
            int[] digits = getDigits(originalNum); // Get digits of the original number

            // Multiply the original number by any one of its digits, let's choose the first digit
            num = originalNum * digits[0];  // Using the first digit for multiplication

            // Append the new digits from the resulting number
            appendDigitsToList(num, digitList);

            // Check for adjacent duplicates
            if (hasAdjacentDuplicates(digitList)) {
                return multiplicationCount;
            }
        }
    }

    // Function to append digits of the number to the list
    private static void appendDigitsToList(int num, List<Integer> digitList) {
        String numStr = String.valueOf(num);
        for (char ch : numStr.toCharArray()) {
            digitList.add(Character.getNumericValue(ch));
        }
    }

    // Function to get digits of a number
    private static int[] getDigits(int num) {
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Function to check for adjacent duplicates
    private static boolean hasAdjacentDuplicates(List<Integer> digitList) {
        for (int i = 1; i < digitList.size(); i++) {
            if (digitList.get(i).equals(digitList.get(i - 1))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);




        // Taking input number
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        // Call the function to find adjacent duplicates and display the result
        int result = findAdjacentDuplicates(num);
        System.out.println("The least number of multiplications to find adjacent duplicates: " + result);
    }
}
