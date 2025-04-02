package JavaMethods;

import java.util.Arrays;
import java.util.Scanner;

public class CountDigitsAndStoreInArray {
    public static int CountDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int[] StoreDigitsInArray(int num) {
        int count = CountDigits(num);
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            int digitsOfNum = num % 10;
            digits[i] = digitsOfNum;
            num /= 10;
        }
        return digits;
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        int countOfDigits = CountDigits(num);
        int[] digits = StoreDigitsInArray(num);
        System.out.println("The number " + num + " contains " + countOfDigits + " digits.");
        System.out.println("Stored digits in array: " + Arrays.toString(digits));

    }
}
