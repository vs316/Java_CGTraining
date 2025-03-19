package ControlFlow;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter number: ");
        int origNumber=input.nextInt();
        int number=origNumber;
        int sum=0;
        while(number !=0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        System.out.println("The sum of the digits of the number: "+origNumber+" = "+sum);
    }
}
