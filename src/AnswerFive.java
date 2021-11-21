import java.util.Scanner;
public class AnswerFive {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //input
        System.out.print("Enter marks of a physic: ");
        int marks1 = sc.nextInt();
        System.out.print("Enter marks of a chemistry: ");
        int marks2 = sc.nextInt();
        System.out.print("Enter marks of a biology: ");
        int marks3 = sc.nextInt();
        System.out.print("Enter marks of a Mathematics: ");
        int marks4 = sc.nextInt();
        System.out.print("Enter marks of a computer ");
        int marks5 = sc.nextInt();

        int total =  marks1 +marks2+marks3+marks4+marks5;
        int percentage = (total *100)/500;

        if (percentage>=90){
            System.out.println("total perentage is " + percentage + "you got A");
        }
        else if (percentage>=80){
            System.out.println("total perentage is " + percentage + "you got B");
        }
        else if (percentage>=70){
            System.out.println("total perentage is " + percentage + "you got C");
        }
        else if (percentage>=60){
            System.out.println("total perentage is " + percentage + "you got D");
        }
        else if (percentage>=40){
            System.out.println("total perentage is " + percentage + "you got E");
        }
        else{
            System.out.println("total perentage is " + percentage + "you got F");
        }


        System.out.println("Total marks ="+ total);
        System.out.println("Percentage = "+percentage);



    }
}
