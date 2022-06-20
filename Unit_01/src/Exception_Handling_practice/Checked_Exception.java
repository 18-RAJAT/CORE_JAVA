package Exception_Handling_practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Checked_Exception {

    public static void main(String[]args) throws Exception
    {
        int n=0;
        System.out.println("Enter a number :");
        BufferedReader br=null;

        try
        {
            br=new BufferedReader(new InputStreamReader(System.in));
            n=Integer.parseInt(br.readLine());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            br.close();//Close the buffer reader...!!
        }
        System.out.println(n);
    }
}
