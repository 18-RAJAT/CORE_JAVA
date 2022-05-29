package Exception_Handling_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Try_with_resources {
    public static void main(String[]args) throws Exception
    {
        int n=0;
        System.out.println("Enter the number :");

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            n=Integer.parseInt(br.readLine());
        }
        System.out.println(n);
    }
}
