package JavaMethods;

import java.util.Scanner;

public class FactorsOfFiveFromOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int factorCount = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                factorCount++;
            }
        }
        int[] arr = new int[factorCount];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                arr[index++] = i;
            }
        }
        System.out.println("Numbers from 1 to " + n + " that are divisible by 5 are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
