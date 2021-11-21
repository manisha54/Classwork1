import java.util.Scanner;
public class AnswerOne {
    public static  void main (String[]args){
        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Enter a  first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a  second number: ");
        int num2 = sc.nextInt();
        //condition
        if (num1 > num2)
            System.out.println("greater number is " + num1);
        else if (num2 > num1)
            System.out.println("greater number is " + num2);
        else
            System.out.print("both number are equal");

    }
}
