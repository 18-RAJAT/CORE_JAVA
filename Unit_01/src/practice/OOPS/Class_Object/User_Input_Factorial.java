package practice.OOPS.Class_Object;

import java.util.*;

public class User_Input_Factorial {

    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number you want to find the factorial : ");

        int n = scn.nextInt();

        int fact = 1;
        int i = 1;

        while(i <= n)
        {
            fact = fact * i;
            i++;
        }

        System.out.println("Factorial of the number is : " + fact);
    }
}
