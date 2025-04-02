package JavaMethods;


import java.util.Scanner;

public class LoopTIllNonZeroInput {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number: ");
            n = sc.nextInt();
            if (n == 0)
                continue;
            else break;
        }
        sc.close();
    }

}
