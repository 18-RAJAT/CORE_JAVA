package Assessment;
import java.lang.Thread;

class A extends  Thread
{
    public void run()
    {
        for(int i=0;i<=10;++i)
        {
            System.out.println("From  A "+ i);
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for(int j=0;j<=10;++j)
        {
            System.out.println("From B "+j);
        }
    }
}

class C extends Thread
{
    public void run()
    {
        for(int k=0;k<=10;++k)
        {
            System.out.println("From C "+ k);
        }
    }
}
public class multithreaded_program_three_threads_are_printing_from1to10concurrently {
public static void main(String[]args)
{
    A a=new A();
    B b=new B();
    C c=new C();
    a.start();
    b.start();
    c.start();
}
}
