package Questions;

import java.util.Scanner;

public class white_space_count {
    public static void main(String[]args)
    {
        int spaces=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        String str=sc.nextLine();

        int i=0;
        while(i<str.length())
        {
            char ch=str.charAt(i);
            if(ch==' '){spaces++;}i++;
        }
        System.out.println("Space :" + spaces);
    }
}
