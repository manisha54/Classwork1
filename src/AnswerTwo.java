//Write a program to find maximum between three numbers.

import java.util.Scanner;
public class AnswerTwo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        //condition
        if (num1>num2 && num1 > num3)
            System.out.println("the gretest number is " + num1);
        else if (num2>num1 && num2 > num3)
            System.out.println("the gretest number is " + num2);
        else if (num3>num2 && num3 > num1)
            System.out.println("the gretest number is " + num3);
        else
            System.out.println("all number are equal");


    }
}
