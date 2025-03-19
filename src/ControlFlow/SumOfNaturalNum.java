package ControlFlow;

import java.util.Scanner;

public class SumOfNaturalNum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double num;
        System.out.println("Enter a positive integer: ");
        num= sc.nextDouble();
        if(num==(int)num &&num>=1){
            int sum=(int)(num*(num+1))/2;
            System.out.println("The sum of "+num+ " natural numbers is "+sum);
        }else{
            System.out.println(num+" is not a natural number;");

        }

    }
}
