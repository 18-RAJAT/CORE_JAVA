package Unit_03;

public class Exception_Handling {
    public static void main(String[]args)
    {
        try{
            int a=0;
            int b = 100/a;
        }
        catch (ArithmeticException ex)
        {
            System.out.println(ex);
        }
        System.out.println("Code Handle");
    }
}


