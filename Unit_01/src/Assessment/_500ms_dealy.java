package Assessment;

class display extends Thread
{
    String name;
    display(String name)
    {
        this.name=name;
    }
    public void run()
    {
        System.out.println("Hello");

        try
        {
            Thread.sleep(500);
            wish(name);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void wish(String name)
    {
        System.out.println(name);
    }
}
public class _500ms_dealy {
    public static void main(String[]args) {
        display a = new display("Rajat");
        display b = new display("Joshi");
        display c = new display("CSE");
        display d = new display("Gehu");
        display f = new display("B.Tech");

        a.start();
        try
        {
            a.join();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        b.start();

        try
        {
            b.join();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        c.start();
        d.start();
        f.start();
    }
}
