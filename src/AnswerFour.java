//Write a program to check weather a character is vowel or consonant.

import java.util.Scanner;
public class AnswerFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  character to check: ");
        char ch = sc.next().toLowerCase().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("vowel");
        else
            System.out.println("consonant");
    }
}
