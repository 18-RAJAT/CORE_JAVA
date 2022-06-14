package Assessment;

class X implements Runnable
{
    public void run()
    {
        for(int i=0;i<=10;++i)
        {
            System.out.println("A " + i);
        }
    }
}

class Y implements Runnable
{
    public void run()
    {
        for(int j=11;j<=21;++j)
        {
            System.out.println("B "+j);
        }
    }
}

public class Set_Get_name_of_threads_also_set_get_priority_of_threads {
    public static void main(String[]args)
    {
        X a= new X();
        Y b=new Y();
        Thread t1= new Thread(a);
        t1.start();
        try {
            t1.join();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        Thread t2=new Thread(b);
        t2.start();
        try{
            t2.join();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println(t1.getName());
        t1.setName("New Thread");
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}
