import java.util.Scanner;
import java.util.*;

public class LineComparision {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation\n"+"------------------------------");
        int X1, X2, Y1, Y2;
        int A1 ,A2, B1, B2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for line one");
            System.out.print("Enter The Value of X1 :");
            X1 = sc.nextInt();
            System.out.print("Enter The Value of Y1 :");
            Y1 = sc.nextInt();
            System.out.print("Enter the Value of X2 :");
            X2 = sc.nextInt();
            System.out.print("Enter the Value of Y2 :");
            Y2 = sc.nextInt();

            double lengthofLine = Math.sqrt(Math.pow((X2 - X1), 2) + Math.pow((Y2 - Y1), 2));
            System.out.println("Length of the line is " + lengthofLine);

            System.out.println("Enter values for second line");
        System.out.print("Enter The Value of A1 :");
        A1 = sc.nextInt();
        System.out.print("Enter The Value of B1 :");
        B1 = sc.nextInt();
        System.out.print("Enter the Value of A2 :");
        A2 = sc.nextInt();
        System.out.print("Enter the Value of B2 :");
        B2 = sc.nextInt();

            double lengthofLine2 = Math.sqrt(Math.pow((A2 - A1), 2) + Math.pow((B2 - B1), 2));
            System.out.println("Length of the line is " + lengthofLine2);
        
        if(lengthofLine == lengthofLine2)
        {
            System.out.println("Line1 and Line2 are Equal.");
        }
        else
        {
            if(lengthofLine > lengthofLine2)
            {
                System.out.println("Line 1 is Bigger Than Line 2");
            }
            else
            {
                System.out.println("Line 1 is Smaller Than Line 2");
            }
        }
    }
}
