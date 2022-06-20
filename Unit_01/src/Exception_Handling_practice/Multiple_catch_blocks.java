package Exception_Handling_practice;

public class Multiple_catch_blocks {
    public static void main(String[]args)
    {
//        try {
//            int a[]=new int [5];
//            a[4]=8;
//            int res=11/0;
//
//            System.out.println(res);
//        }
//        catch (ArithmeticException e)
//        {
//            System.err.println("Can't divide by zero");
//        }
//        catch (ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println("Out of bound");
//        }
//        catch (Exception e)
//        {
//            System.out.println("Something wrong");
//        }
//        finally {
//            System.out.println("Terminate");
//        }

        try{
            int a[]=new int[8];
            a[9]=10;
            System.out.println("Right");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
//            System.out.println("Out of bound array");
        }
    }
}
