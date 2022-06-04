package Threading_Practice;

class first implements Runnable
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

class second implements Runnable
{
    public void run()
    {
        for(int i=0;i<=5;++i)
        {
            System.out.println("2nd");
            try{Thread.sleep(500);}catch (Exception e){}
        }
    }

    public void start() {
    }
}

public class RunnAble_Interface{
    public static void main(String[]args)
    {
        first obj1= new first();
        second obj2=new second();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();

    }
}


