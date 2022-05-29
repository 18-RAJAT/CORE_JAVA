package Exception_Handling_practice;

class ExceptionD {
    public static void main(String []args)
    {
        try{
            int ans=9/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error");
            System.err.println("MSG");
        }
        finally {
            System.out.println("BYE");
        }
    }
}
