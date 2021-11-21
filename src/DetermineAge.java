import java.util.Scanner;
public class DetermineAge {
    public static void main (String[]ags){
        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Enter a age: ");
        int age = sc.nextInt();
        System.out.print("Type true for male or false for female: ");
        boolean male = sc.nextBoolean();

        if (male) {
            if (age < 20)
                System.out.println("Boy");
            else
                System.out.println("Man");
        }
        else {
            if (age>20)
                System.out.println("Women");
            else
                System.out.println("Female");

        }

    }

}
