package Threading_Practice;

class one extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;++i)
        {
            System.out.println("1st");
            try{Thread.sleep(500);}catch (Exception e){}
        }
        System.out.println();
        System.out.println();
    }
}

class two extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;++i)
        {
            System.out.println("2nd");
            try{Thread.sleep(500);}catch (Exception e){}
        }
    }
}

public class Thread_Class {
    public static void main(String[]args)
    {
        one obj1=new one();
        second obj2=new second();

        obj1.start();
        obj2.start();
    }
}
