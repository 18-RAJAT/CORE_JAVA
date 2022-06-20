package JAVA_EXAM;

class c1 extends Thread
{
    public void run()
    {
        for(int i=0;i<10;++i)
        {
            System.out.println("class c1 "+i);
        }
    }
}

class c2 extends Thread
{
    public void run()
    {
        for(int i=0;i<10;++i)
        {
            System.out.println("class c2 "+i);
        }
    }
}

class c3 extends Thread
{
    public void run()
    {
        for(int i=0;i<10;++i)
        {
            System.out.println("class c3 "+i);
        }
    }
}

public class Three_threads_different_print {
    public static void main(String[] args) {
        c1 cls1=new c1();
        c2 cls2=new c2();
        c3 cls3=new c3();


        Thread t1=new Thread(cls1);
        Thread t2=new Thread(cls2);
        Thread t3=new Thread(cls3);

        t1.start();
        t2.start();
        t3.start();
    }
}
