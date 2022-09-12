import java.util.Scanner;
import java.util.*;

public class LineComparision {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation\n"+"------------------------------");
        int X1, X2, Y1, Y2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value of X1 :");
        X1 = sc.nextInt();
        System.out.print("Enter The Value of Y1 :");
        Y1=sc.nextInt();
        System.out.print("Enter the Value of X2 :");
        X2 = sc.nextInt();
        System.out.print("Enter the Value of Y2 :");
        Y2 = sc.nextInt();

        double lengthofLine = Math.sqrt(Math.pow((X2-X1),2)+Math.pow((Y2-Y1),2));
        System.out.println("Length of the line is "+lengthofLine);
    }
}
