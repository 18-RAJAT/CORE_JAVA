package Assessment;

import java.util.Scanner;

class Divide_two_numbers_with_proper_exception_handlers {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers :");

        int result;
        int first=sc.nextInt();
        int second=sc.nextInt();
        try
        {
            result=first/second;
            System.out.println("Two number divide is " + result);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
