import java.util.Scanner;
public class Palindrome {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int rem = num%10;
        int quot = num/10;
        int result = rem * 10 + quot;

        if (result==num)
            System.out.println(num + "is a palindrome");
        else
            System.out.println(num + "is not a palindrome");

    }

}
