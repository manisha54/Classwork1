//write a program to check weather a year is a leap or not.

import java.util.Scanner;
public class AnswerThird {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (year%4==0 && year%100!=0 || year%400==0 )
            System.out.print("given year is leap");
        else
            System.out.print("given year is not leap");

    }
}
