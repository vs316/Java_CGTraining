package JavaStrings;

import java.util.Scanner;

public class StringCharacterComparison {
    public static char[] extractCharacterUsingCharAt(String text) {
        int length = text.length();
        char[] charArray = new char[length];
        //Loop through each character and store in array
        for (int i = 0; i < length; i++) {
            charArray[i] = text.charAt(i);
        }
        return charArray;
    }

    public static boolean compareCharacterArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = scanner.nextLine();
        char[] manualCharArray = extractCharacterUsingCharAt(text);

        char[] builtInCharArray = text.toCharArray();
        boolean areEqual = compareCharacterArrays(manualCharArray, builtInCharArray);

        // Display results
        System.out.println("Characters using charAt(): " + String.valueOf(manualCharArray));
        System.out.println("Characters using toCharArray(): " + String.valueOf(builtInCharArray));
        System.out.println("Are both character arrays equal? " + areEqual);

        scanner.close();

    }
}
